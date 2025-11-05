package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class ParallelCommand extends ParallelCommandGroup
{
    /*
     * Run both the shooter and algae remover at the same time,
     * then stop them both. Runtime of your choosing.
     */
    public ParallelCommand ()
    {
        addCommands(
            new WaitCommand(0), // temp
            new ShooterForwards(5),
            new ShooterStop(),
            new AlgaeForwards(5),
            new AlgaeStop()
        );

        addRequirements();
    }
}
