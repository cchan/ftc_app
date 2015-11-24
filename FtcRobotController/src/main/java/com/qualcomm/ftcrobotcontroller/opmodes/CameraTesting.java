package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by Clive on 11/19/2015.
 */
public class CameraTesting extends OpMode {
    @Override
    public void init(){
    }

    @Override
    public void init_loop(){
        telemetry.addData("msg","Hello");
    }

    @Override
    public void loop(){
        telemetry.addData("msg2","Loop");
    }
}
