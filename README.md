# MultiThreading-Concurrency-dojo

Java concurrency, drilled: threads, locks, executors, and the bugs that break them all, with fixes.

This repo is a running log of concurrency concepts as I learn and drill them — starting from basic thread creation and building up towards locks, executors, and other advanced topics over time.

## Structure

```
Basics/
  MultiThreadingWithThreadClass.java   # Creating threads by extending Thread
  MultiThreadingWithRunnable.java      # Creating threads by implementing Runnable
  OddEvenPrint.java                    # Two threads coordinating via wait()/notifyAll()
```

## Topics covered so far

- **Thread creation via `extends Thread`** ([MultiThreadingWithThreadClass.java](Basics/MultiThreadingWithThreadClass.java)) — overriding `run()` and starting threads directly.
- **Thread creation via `implements Runnable`** ([MultiThreadingWithRunnable.java](Basics/MultiThreadingWithRunnable.java)) — the preferred approach when the class already extends something else, since Java doesn't support multiple inheritance.
- **Thread coordination with `synchronized`, `wait()`, and `notifyAll()`** ([OddEvenPrint.java](Basics/OddEvenPrint.java)) — two threads alternately printing odd and even numbers using a shared lock.

## will add

More advanced topics will be added here as they're drilled, e.g.:

- Locks (`ReentrantLock`, `ReadWriteLock`)
- Executors and thread pools
- `volatile`, atomics, and memory visibility
- Producer-consumer patterns
- Deadlocks, race conditions, and common concurrency bugs (with fixes)
- `java.util.concurrent` utilities (`CountDownLatch`, `Semaphore`, `CompletableFuture`, etc.)
