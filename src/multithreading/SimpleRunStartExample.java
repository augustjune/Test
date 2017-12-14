package multithreading;

public class SimpleRunStartExample implements RunStartExample{
    /**
     * Runnable interface representative has only run() method
     */
    private Runnable taskA = createRunnable("A");
    private Runnable taskB = createRunnable("B");

    /**
     * Creating Thread out of Runnable puts it in the box with many other methods, one of them is start() method
     * The main difference between them is that if you use run() function, you execute it on current thread,
     * but start() function starts new thread, which goes parallel with main thread
     */
    private Thread threadA = new Thread(taskA);
    private Thread threadB = new Thread(taskB);

    /**
     * threadA will end it'strings work and only then function thread will continue with starting threadB
     * threadB may finish before function'strings finish as well as after
     * result:
     *      function start
     *      threadA work
     *      threadA finish
     *      NO PREDICTABLE RESULT
     */
    @Override
    public void runStartExample() {
        threadA.run();
        threadB.start();
        System.out.println("Run-Start Example has finished");
    }

    /**
     * threadA will end it'strings work, then function thread will run threadB and then end own work
     * result:
     *      function start
     *      threadA work
     *      threadA finish
     *      threadB work
     *      threadB finish
     *      function finish
     */
    @Override
    public void runRunExample() {
        threadA.run();
        threadB.run();
        System.out.println("Run-Run Example has finished");
    }

    /**
     * function will start threadA, then without waiting for threadA'strings finish start threadB and then without
     * waiting for threadA or threadB finish will finish it'strings work
     * result:
     *      function start
     *      NO PREDICTABLE RESULT
     */
    @Override
    public void startStartExample() {
        threadA.start();
        threadB.start();
        System.out.println("Start-Start Example has finished");
    }

    /**
     * function will start threadA, then without waiting for threadA'strings finish run threadB and after threadB'strings finish
     * will end own work
     * result:
     *      NO PREDICTABLE RESULT
     *      but function will finish only after threadB'strings finish
     */
    @Override
    public void startRunExample() {
        threadA.start();
        threadB.run();
        System.out.println("Start-Run Example has finished");
    }

    private Runnable createRunnable(String name) {
        return () -> {
            System.out.println("Thread" + name + " has started");
            for (int i = 0; i < 100; i++) {
                tryToSleep();
                System.out.print(name + " ");
            }
            System.out.println("\nThread" + name + " has ended");
        };
    }

    private void tryToSleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
