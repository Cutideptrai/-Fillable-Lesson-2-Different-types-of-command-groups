package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class ShooterBackwards extends SequentialCommandGroup
{
    /** Will run for 1s when no time given
     * @param time the time in seconds the command runs
    */
    public ShooterBackwards (double time)
    {
        addCommands(
            Constants.SHOOTER_SUBSYSTEM.runMotorBackwardsCommand(),
            new WaitCommand(time)
            );
        
        addRequirements(Constants.SHOOTER_SUBSYSTEM);
    }

    public ShooterBackwards ()
    {
        this(1);
    }
}