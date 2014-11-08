package command;

public class MotorVibrateCommand implements Command{
    private VibrationMotor motor;
    
    public MotorVibrateCommand(VibrationMotor motor){
        this.motor = motor;
    }
    
    public void execute(){
        motor.vibrate();
    }

}