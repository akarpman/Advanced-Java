//Andrew Karpman
//MultiThreading lab
//runs a counting thread that is faster once the lab is complete
package lab2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UnresponsiveUIThread extends JFrame {
	private static final long serialVersionUID = 1L;
// Start or stop counter flag
	private boolean stop = false;
	private JTextField tfCount;
	private int count = 1;

	public UnresponsiveUIThread() {
		Task t = new Task();//creates an object to run the code
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		cp.add(new JLabel("Counter"));
		setTfCount(new JTextField(getCount() + " ", 10));
		getTfCount().setEditable(false);
		cp.add(getTfCount());
		JButton btnStart = new JButton("Start Counting");
		cp.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				setStop(false);
				
				
				//got to move this work to a helper thread (maybe another deamon thread
				t.run();
			}
		});
		JButton btnStop = new JButton("Stop Counting");
		cp.add(btnStop);
		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
// Signal that we need to stop
				setStop(true);
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Counter");
		setSize(300, 120);
		setVisible(true);
	}
	

	public static void main(String[] args) {
// Run GUI codes in Event-Dispatching thread for thread safety
		
		Task t = new Task();
		Thread thread = new Thread(t);
		thread.setPriority(1);
		thread.start();
		//t.run();
	}


	public boolean isStop() {
		return stop;
	}


	public void setStop(boolean stop) {
		this.stop = stop;
	}


	public JTextField getTfCount() {
		return tfCount;
	}


	public void setTfCount(JTextField tfCount) {
		this.tfCount = tfCount;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
}

and

package lab2;

public class Task implements Runnable {

	@Override
	public void run() {
		UnresponsiveUIThread tr = new UnresponsiveUIThread();
		Task t = new Task();
		Thread thread = new Thread(t);
		// TODO Auto-generated method stub
		for (int i = 0; i < 100000; i++) {// increased to make the counter take longer
			// Check if STOP button has been pushed
			// which changes the stop flag state to true
			

			if (tr.isStop())
				break;
			tr.getTfCount().setText(tr.getCount() + " ");
			tr.setCount(tr.getCount() + 1);
			try {
				thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
