# MultiThreadExample
how to use multiple threads to accelerate your process
/**
 * this demo shows how to accelerate your process by using threads
 * The task for a step is a function that return a int after 10 ms
 * There are 100 step totally.
 * If execute by step,then about 1500ms,30ms by 100 threads
 * Multithread function:
 * using ThreadPoolExcutor by 100 threads,then eveny step as a action put into pool.
 * Inside every step,insert its result in a global array.
 * Then poll the result array if its size is 100 which is the sign of complement.
 * When completed,print the result.
 *
 * The equivalent in c# is Task.WaitAll
 */
