package org.computer;

public class Desktop implements Hardware,Software{

	@Override
	public void softwareResources() {
		System.out.println("i3 Processor");
	}

	@Override
	public void hardwareResources() {
		System.out.println("12GB RAM");
	}
	private void desktopmodel() {
		System.out.println("Dell");
	}
public static void main(String[]args)
{
	Desktop d = new Desktop();
	d.desktopmodel();
	d.softwareResources();
	d.hardwareResources();
}
}

