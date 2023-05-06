package thread._06;import java.nio.channels.InterruptedByTimeoutException;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
		}
		
		
		System.out.println("메인 스레드 종료");
	}

}