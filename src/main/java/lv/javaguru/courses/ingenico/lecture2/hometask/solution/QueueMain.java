package lv.javaguru.courses.ingenico.lecture2.hometask.solution;

public class QueueMain {

    public static void main(String[] args) {
        Queue<String> queue = new QueueImpl<>();
        queue.add("0");
        queue.add("1");
        queue.add("2");
        System.out.println(" --- Added 0, 1, 2");
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("--- After element");
        queue.element();
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("--- After poll");
        queue.poll();
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("--- Contains 1");
        System.out.println(queue.contains((string) -> string.equals("1")));

        System.out.println("--- Add {5, 6, 7}");
        Queue<String> additional = new QueueImpl<>();
        additional.add("5");
        additional.add("6");
        additional.add("7");
        queue.addAll(additional);
        for (String s : queue){
            System.out.println(s);
        }
    }

}
