package com.javarush.test.level16.lesson03.task01;

/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Solution {
    public static volatile RunAway RUNAWAY = new RunAway();

    public static void main(String[] args){
        Plane plane1 = new Plane("Ту 134");
        Plane plane2 = new Plane("Боинг 727");
        Plane plane3 = new Plane("Су 27");
        Plane plane4 = new Plane("Миг 29");
        Plane plane5 = new Plane("Т 50");
        plane5.interrupt();

    }

    public static class RunAway{
        public Thread t;
        public Thread getTakingOffPlane(){
            return t;
        }
        public void setTakingOffPlane(Thread t){
            synchronized (this){
                this.t = t;
            }
        }
    }

    public static class Plane extends Thread{
        public Plane(String name){
            super(name);
            start();
        }

        public void run(){
            Thread currentThread = Thread.currentThread();

            boolean isTakenOff=false;
            while (!currentThread.isInterrupted()){
                while (!isTakenOff){
                    if(RUNAWAY.getTakingOffPlane()==null){
                        RUNAWAY.setTakingOffPlane(this);
                        TakingOff();
                        System.out.println(getName() + " На взлет");
                        isTakenOff=true;
                        System.out.println(getName() + " В воздухе!");
                        RUNAWAY.setTakingOffPlane(null);
                    }else if(!this.equals(RUNAWAY.getTakingOffPlane())){
                        Waiting();
                        System.out.println(getName() + " Ожидает");
                    }
                }
            }
        }

        public void TakingOff(){
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        public void Waiting(){
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static class StatusPlane{
        public static final String WAITING="Waiting";
        public static final String TAKING_OFF="Taking off";
        public static final String ON_AIR="On air";
    }
}

