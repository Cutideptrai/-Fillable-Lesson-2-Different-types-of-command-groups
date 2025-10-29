// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new MotorSubsystem. */

  private SparkMax shooterMotor = new SparkMax(Constants.ShooterID, MotorType.kBrushless);

  public ShooterSubsystem() {}

  public void runMotorForwards(){
    shooterMotor.set(0.5);
  }

  public void runMotorBackwards(){
    shooterMotor.set(0.5);
  }

  public void stop(){
    shooterMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
