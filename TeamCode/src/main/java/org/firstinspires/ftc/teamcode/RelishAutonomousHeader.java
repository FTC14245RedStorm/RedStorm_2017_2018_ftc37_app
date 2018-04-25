package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Fiona Beer on 4/23/2018.
 */

public abstract class RelishAutonomousHeader extends LinearOpMode {

    DcMotor motorLeft, motorRight, motorLift;
    Servo servoGripper;

    public void initialize() {

        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLift = hardwareMap.dcMotor.get("motorLift");
        servoGripper = hardwareMap.servo.get("servoGripper");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
    }

    public void move(double left, double right) {

        motorLeft.setPower(left);
        motorRight.setPower(right);
    }
}