package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class RaceCommand extends ParallelRaceGroup
{
    /*
     * Run both the shooter and the remover
     * set one of them to be shorter than the other
     * stop both after race group
     */
    public RaceCommand ()
    {
        addCommands(
            new WaitCommand(0) // temp
        );

        addRequirements();
    }
}
