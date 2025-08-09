//package Exercitii.ExercitiiDeInterviu.Thread;
//
//import lombok.SneakyThrows;
//
//public class ExecutareaInParalel {
//    public static void main(String[] args) {
//        new Thread1().start();
//        new Thread2().start();
//    }
//}
//class Thread1 extends Thread {
//    @SneakyThrows
//    public void run() {
//        for(int i = 0; i < 10000; i++) {
//            System.out.println("primul "+i);
//            Thread.sleep(10);
//        }
//    }
//}
//class Thread2 extends Thread {
//    public void run() {
//        for(int i = 0; i < 10000; i++) {
//            System.out.println("doi " +i);
//        }
//    }
//}
//
