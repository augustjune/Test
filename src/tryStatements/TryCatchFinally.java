package tryStatements;

public class TryCatchFinally {

    /**
     * you can throw or catch only non-null Objects that extend class Throwable
     * Exception hierarchy
     *
     *               Object
                        |
                Throwable (CHECKED)
                /               \
            Error(UNCHECKED)    Exception (CHECKED)
                                    |
                                RuntimeException (UNCHECKED)
     */

    /**
     * System.err vs. System.out
     *
     * System.out is buffered output stream, but System.err isn't
     * so below method'strings output may be:
     *      Exception in thread "main" java.lang.Error
     *      sout
     *
     */
    void testSystemOutput() {
        System.out.println("sout");
        String s = "123";
        throw new Error();
    }

    /**
     * Compiler still evaluates it even though function must return int
     * but it doesn't
     * No 'Missing return statement' or other errors
     */
    int endlessWhile() {
        while (true);
    }

    /**
     * The other way to use function without return statement is to throw
     * Exception
     */
    int noReturnUsingException() {
        throw new RuntimeException();
    }

    /**
     * We can use multiple catch statement, but have to remember about the order:
     *  first child and only then parent (RuntimeException -> Exception but not Exception -> RuntimeException)
     *  we also can place same level exceptions like Runtime -> Error as well as Error -> Runtime
     **/
    void doubleCatchStatement() {
        try {
            throw new RuntimeException();
        }catch (RuntimeException e) {}
        catch (Exception e) {}
    }

    /**
     * catch is used during run-time (not compile-time) so it is caught by Object type (not reference type)
     * BUT we must add catch(Throwable) statement, because it is checking if we handle exception in compile-time
     * that'strings why the output will be next:
     *      catch Exception
     *      next statement
     */
    void catchByReference() {
        try {
            Throwable t = new Exception(); // reference of type Throwable points on object of type Exception
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {                     //Have to use this statement or 'unhandled exception'
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }

    /**
     * finally statement is called when Exception is thrown
     * the output is:
     *      finally
     */
    void tryThrowFinally() {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }

    /**
     * finally statement is called even when we return from try section
     * the output is:
     *      finally
     */
    void tryReturnFinally() {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }

    /**
     * finally statement isn't called only if we 'kill' JVM
     * the output is:
     *      Precess finished with exit code 42
     */
    void tryExitFinally() {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }

    /**
     * finally statement does not catch Exception and it is still falling down
     * the output is:
     *      try
     *      finally
     */
    void tryFinallyWithoutCatch() {
        try {
            System.err.println("try");
            if(true) throw new RuntimeException();      // unreachable statement with 'more' if don't use if(true)
        } finally {
            System.err.println("finally");
        }
        System.out.println("more");     // 'more' is not shown
    }

    /**
     * finally statement is above try statement so function returns 1
     */
    int tryReturnFinallyReturn() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }

    /**
     * As in example above function ends with throwing Exception without returning int value
     */
    int tryReturnFinallyThrow() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }

    /**
     * output is:
     *      0 1 4 6 7 8
     */

    void multiTryCatchFinally() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Exception();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // Doesn't execute: exception was thrown, but not RuntimeException type
            } finally {
                System.err.print(" 4"); // Always executes
            }
            System.err.print(" 5");     // Doesn't execute: thrown exception hasn't been caught
        } catch (Exception e) {
            System.err.print(" 6");     // Executes: thrown exception is caught
        } finally {
            System.err.print(" 7");     // Always executes
        }
        System.err.print(" 8");         // Executes: exception was caught, flow is running normally
    }

    /**
     * output is:
     *      0 1 4 7
     */
    void multiTryCatchFinally2() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Error();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // Doesn't execute: Exception thrown of different type
            } finally {
                System.err.print(" 4"); // Always executes
            }
            System.err.print(" 5");     // Doesn't execute: thrown exception hasn't been caught
        } catch (Exception e) {
            System.err.print(" 6");     // Doesn't execute: Exception thrown of different type
        } finally {
            System.err.print(" 7");     // Always executes
        }
        System.err.print(" 8");         // Doesn't execute: thrown exception hasn't been caught
    }
}
