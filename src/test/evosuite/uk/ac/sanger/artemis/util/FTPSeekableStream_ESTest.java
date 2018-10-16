/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:25:49 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.FTPSeekableStream;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FTPSeekableStream_ESTest extends FTPSeekableStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, 0, 2887);
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", fTPSeekableStream0.getSource());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          URI uRI0 = MockURI.aHttpURI;
          URL uRL0 = MockURI.toURL(uRI0);
          FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, (-2220), (-2220));
          // Undeclared exception!
          try { 
            fTPSeekableStream0.read((byte[]) null, (-2220), 4);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"200.42.42.0:21\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:584)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:243)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:202)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:306)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.getClient(FTPSeekableStream.java:97)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.initStream(FTPSeekableStream.java:237)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.read(FTPSeekableStream.java:152)
             // sun.reflect.GeneratedMethodAccessor169.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("", "");
          URL uRL0 = mockFile0.toURL();
          FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, (-423), (-423));
          // Undeclared exception!
          try { 
            fTPSeekableStream0.eof();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"127.0.0.1:21\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:584)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:243)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:202)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:306)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.getClient(FTPSeekableStream.java:97)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.length(FTPSeekableStream.java:135)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.eof(FTPSeekableStream.java:203)
             // sun.reflect.GeneratedMethodAccessor157.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Could not save the index file locally");
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, "Could not save the index file locally", "");
      File file0 = fTPSeekableStream0.getTmpFolder();
      assertEquals("tmp", file0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("", "", 1248, "", uRLStreamHandler0);
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, 1248);
      MockFile mockFile0 = new MockFile("");
      fTPSeekableStream0.setTmpFolder(mockFile0);
      File file0 = fTPSeekableStream0.getTmpFolder();
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "the rsID %s for the record at position %s:%d is not in dbSNP", uRLStreamHandler0);
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL1);
      String string0 = fTPSeekableStream0.getSource();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("", "", 1248, "", uRLStreamHandler0);
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, 1248);
      File file0 = fTPSeekableStream0.getIndexFile();
      assertNotNull(file0);
      assertEquals("/tmp/.bai", file0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/fooExample.bai");
      fTPSeekableStream0.getIndexFile();
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fTPSeekableStream0.getIndexFile();
      assertNotNull(file0);
      assertTrue(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/fooExample.bai");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ftp://ftp.someFakeButWellFormedURL.org/fooExample");
      File file0 = fTPSeekableStream0.getIndexFile();
      assertNotNull(file0);
      assertEquals(1392409281320L, file0.lastModified());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
      // Undeclared exception!
      try { 
        fTPSeekableStream0.setTmpFolder((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.FTPSeekableStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FTPSeekableStream fTPSeekableStream0 = null;
      try {
        fTPSeekableStream0 = new FTPSeekableStream((URL) null, "seek ", "seek ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FTPSeekableStream fTPSeekableStream0 = null;
      try {
        fTPSeekableStream0 = new FTPSeekableStream((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, "Could not save the index file locally", "");
      File file0 = fTPSeekableStream0.getIndexFile();
      assertEquals("/tmp/url.bai", file0.toString());
      assertNotNull(file0);
      
      File file1 = fTPSeekableStream0.getTmpFolder();
      assertEquals("/tmp", file1.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          URL uRL0 = MockURL.getFtpExample();
          FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
          EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/fooExample.bai");
          FileSystemHandling.createFolder(evoSuiteFile0);
          // Undeclared exception!
          try { 
            fTPSeekableStream0.getIndexFile();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"200.42.42.0:21\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:584)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:243)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:202)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:306)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.getClient(FTPSeekableStream.java:97)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.getIndexFile(FTPSeekableStream.java:285)
             // sun.reflect.GeneratedMethodAccessor154.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, "uk.ac.sanger.artemis.util.FTPSeekableStream", "uk.ac.sanger.artemis.util.FTPSeekableStream");
      File file0 = fTPSeekableStream0.getIndexFile();
      try { 
        fTPSeekableStream0.setTmpFolder(file0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // File fooExample.bai is not a folder
         //
         verifyException("uk.ac.sanger.artemis.util.FTPSeekableStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
      fTPSeekableStream0.close();
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", fTPSeekableStream0.getSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
          URL uRL0 = MockURL.URL("", "", 1248, "", uRLStreamHandler0);
          FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, 1248);
          // Undeclared exception!
          try { 
            fTPSeekableStream0.length();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"127.0.0.1:21\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:584)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:243)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:202)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:306)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.getClient(FTPSeekableStream.java:97)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.length(FTPSeekableStream.java:135)
             // sun.reflect.GeneratedMethodAccessor152.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      URL uRL0 = mockFile0.toURL();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0, "Using cached index ", "Using cached index ");
      assertEquals("file:/", fTPSeekableStream0.getSource());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
      String string0 = fTPSeekableStream0.getSource();
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
      fTPSeekableStream0.seek(0L);
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", fTPSeekableStream0.getSource());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          URL uRL0 = MockURL.getFileExample();
          FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
          // Undeclared exception!
          try { 
            fTPSeekableStream0.read();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"200.42.42.0:21\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:584)
             // org.apache.commons.net.SocketClient._connect(SocketClient.java:243)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:202)
             // org.apache.commons.net.SocketClient.connect(SocketClient.java:306)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.getClient(FTPSeekableStream.java:97)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.initStream(FTPSeekableStream.java:237)
             // uk.ac.sanger.artemis.util.FTPSeekableStream.read(FTPSeekableStream.java:225)
             // sun.reflect.GeneratedMethodAccessor149.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FTPSeekableStream fTPSeekableStream0 = null;
      try {
        fTPSeekableStream0 = new FTPSeekableStream((URL) null, 809, (-1603));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      FTPSeekableStream fTPSeekableStream0 = new FTPSeekableStream(uRL0);
      long long0 = fTPSeekableStream0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FTPSeekableStream fTPSeekableStream0 = null;
      try {
        fTPSeekableStream0 = new FTPSeekableStream((URL) null, 49);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }
}