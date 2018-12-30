/**
 * 
 */
package basics.thread;

/**
 * @author Aniruddha.Raje
 *
 */

//ConcurrentHashMap - 
//Each method is synchronized using an object level lock. So the get and put methods on synchMap acquire a lock.
//Locking the entire collection is a performance overhead. While one thread holds on to the lock, no other thread can use the collection.

//SynchronizedMap - 
//There is no locking at the object level,The locking is at a much finer granularity. 
//Reads can happen very fast while write is done with a lock.

//sleep(): Causes the currently executing thread to sleep for the specified number of milliseconds

//If join() is called on a Thread instance, 
//the currently running thread will block until the Thread instance has finished executing.

//yield() basically means that the thread is not doing anything particularly important 
//and if any other threads or processes need to be run, they should run. 
public class TheadNotes {

}
