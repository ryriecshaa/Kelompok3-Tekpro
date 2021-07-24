import java.util.Scanner;

import Remote.RemoteControl;
import Remote.RemoteSimple;
import Remote.RemoteSmart;
import Television.ITelevision;
import Television.SonyTelevision;
import Television.XiaomiTelevision;
import Television.SamsungSmartTelevision;

public class MainClass {
    public static void main(String[] args) {
        ITelevision sonyTelevision = new SonyTelevision();
        RemoteControl simpleRemoteControl = new RemoteSimple(sonyTelevision);

        ITelevision xiaomiTelevision = new XiaomiTelevision();
        simpleRemoteControl = new RemoteSimple(xiaomiTelevision);
        
        ITelevision samsungSmartTelevision = new SamsungSmartTelevision();
        RemoteControl smartRemoteControl = new RemoteSmart(samsungSmartTelevision);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Select TV model: ");
        System.out.println("1. Samsung");
        System.out.println("2. Sony");
        System.out.println("3. Xiaomi");
        System.out.print("Input: ");
        int choice = scan.nextInt();
        ITelevision television;
        switch (choice)
        {
        case 1: television = new SamsungSmartTelevision(); break;
        case 2: television = new SonyTelevision(); break;
        case 3: television = new XiaomiTelevision(); break;        
        }
        RemoteControl remoteControl = choice == 1? smartRemoteControl : simpleRemoteControl;
        System.out.print("Turn On TV? [Y/N] ");
        boolean turnOn = scan.next().equals("Y")? true : false;
        choice = 0;
        if (turnOn)
        {
        	System.out.println("---------------------------------------------------");
        	remoteControl.on();
        	System.out.println("Remote type: " + remoteControl.getClass().getSimpleName());
        }
        while (turnOn)
        {
        	System.out.println("---------------------------------------------------");
        	if (choice != 0)
        	{
        		switch (choice)
            	{
        		case 1: remoteControl.leftButtonPressed(); break;
        		case 2: remoteControl.rightButtonPressed(); break;
        		case 3: remoteControl.upButtonPressed(); break;
        		case 4: remoteControl.downButtonPressed(); break;
        		case 5: remoteControl.off(); return;
            	}
        		choice = 0;
        		System.out.println("---------------------------------------------------");
        	}
        	System.out.println("Select Action: ");
        	boolean isSmart = remoteControl instanceof RemoteSmart;
        	System.out.println("1. Left Button " + (isSmart? "(Previous Channel)" : "(Increase Volume)"));
        	System.out.println("2. Right Button " + (isSmart? "(Next Channel)" : "(Decrease Volume)"));
        	System.out.println("3. Up Button " + (isSmart? "(Increase Volume)" : "(Next Channel)"));
        	System.out.println("4. Down Button " + (isSmart? "(Decrease Volume)": "(Previous Channel)"));
        	System.out.println("5. Shut Down TV");
        	System.out.print("Input: ");
        	choice = scan.nextInt();
        }
    }
}
