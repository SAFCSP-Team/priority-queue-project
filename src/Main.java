class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("Task One", 10);
        pq.add("Task Two", 2);
        pq.add("Task Three", 6);
        System.out.println(pq.remove()); // 10
        System.out.println(pq.remove()); // 2
        System.out.println(pq.remove()); // 6
    }
}