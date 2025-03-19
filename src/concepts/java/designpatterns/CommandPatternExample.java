package designpatterns;

/**
 * Command Pattern Example: Useful for encapsulating a request (e.g., task queues, transaction management).
 */
interface Command {
    void execute();
}

class Light {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}

class TurnOnCommand implements Command {
    private Light light;
    public TurnOnCommand(Light light) { this.light = light; }
    public void execute() { light.turnOn(); }
}

class TurnOffCommand implements Command {
    private Light light;
    public TurnOffCommand(Light light) { this.light = light; }
    public void execute() { light.turnOff(); }
}

class RemoteControl {
    private Command command;
    public void setCommand(Command command) { this.command = command; }
    public void pressButton() { command.execute(); }
}

public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        Command on = new TurnOnCommand(light);
        Command off = new TurnOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(on);
        remote.pressButton();
        remote.setCommand(off);
        remote.pressButton();
    }
}
