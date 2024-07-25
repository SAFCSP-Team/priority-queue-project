# Priority Queue

### Objective

In this project, our objective is to understand how to use a Priority Queue data structure using Sorted Linked List Implementation.


### Problem

you have tasks with priorities (task name, task priority) and you need to store them in a Priority Queue.

> The higher the priority value, the higher the priority of the task to get processed.

### Implementation

* Implement the `add` method in the `PriorityQueue` class, which stores a task based on its priority.
* Implement the `remove` method in the `PriorityQueue` class, which retrieves and removes the task with the highest priority.
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
        System.out.println(pq.remove()); // 10
        System.out.println(pq.remove()); // 2
        System.out.println(pq.remove()); // 6
    }
}


```
