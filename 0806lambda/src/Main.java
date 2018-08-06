
public class Main {

	public static void main(String[] args) {
		// 별도의 클래스를 만들어서 사용하기
//		RunnableImpl r = new RunnableImpl();
//		Thread th = new Thread(r);
//		th.start();
//		RunnableImpl r1 = new RunnableImpl();
//		Thread th1 = new Thread(r1);
//		th1.start();

//		// 익명클래스 이용하기
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				// 1초마다 쉬면서 1부터 10까지 출력
//				int i = 1;
//				while (i <= 10) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("i: " + i);
//					i++;
//				}
//			}
//		};

		// 람다 이용하기
		Runnable r = () -> {
			// 클래스와 run이라는 메소드 이름이 없어짐.
			// 1초마다 쉬면서 1부터 10까지 출력
			int i = 1;
			while (i <= 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("i: " + i);
				i++;
			}
		};
	}
}
