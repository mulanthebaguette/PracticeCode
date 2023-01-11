// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  TalonFX shooterMotor;

  /** Creates a new Shooter2. */
  public Shooter() {
    shooterMotor = new TalonFX(8);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  
  public void moveShooter(){
    shooterMotor.set(TalonFXControlMode.PercentOutput, 0.5);
  }

  public void stopShooter(){
    shooterMotor.set(TalonFXControlMode.PercentOutput, 0.0);

  }

}
