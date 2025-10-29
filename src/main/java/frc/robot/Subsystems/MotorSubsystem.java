// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {
  /** Creates a new MotorSubsystem. */

  private SparkMax motor1 = new SparkMax(Constants.MotorID, MotorType.kBrushless);

  public MotorSubsystem() {}

  public void runMotor(){
    motor1.set(.5);
  }

  public void stop(){
    motor1.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
