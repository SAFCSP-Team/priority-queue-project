# Priority Queue

### Objective

In this project, our objective is to understand how to use a Priority Queue data structure using Sorted Linked List Implementation.


### Problem

Implement a task manager system that stores tasks with specific priorities and organizes them using a priority queue data structure.

> The higher the priority value, the higher the priority of the task to get processed.

### Implementation

* Implement the `add` method in the `PriorityQueue` class, which **stores a task based on its priority**.
* Implement the `remove` method in the `PriorityQueue` class, which **retrieves and removes** the task with the highest priority.
* Finally run the main method. The output should be as follows:

```
Task [name = Task One, priority = 10]
Task [name = Task Three, priority = 6]
Task [name = Task Two, priority = 2]

```

> The highest task priority is dequeue/process first.


```java

class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("Task One", 10);
        pq.add("Task Two", 2);
        pq.add("Task Three", 6);
        System.out.println(pq.remove()); // Task One
        System.out.println(pq.remove()); // Task Three
        System.out.println(pq.remove()); // Task Two
    }
}

```
