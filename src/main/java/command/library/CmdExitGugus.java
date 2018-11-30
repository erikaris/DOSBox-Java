/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.library;

/**
 *
 * @author erikaris
 */

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

/**
 * Command to change current directory. Example for a command with optional
 * parameters.
 */


class CmdExitGugus extends Command {

    protected CmdExitGugus(String name, IDrive drive) {
        super(name, drive);
    }

    @Override
    public boolean checkNumberOfParameters(int numberOfParametersEntered) {
        return numberOfParametersEntered == 0;
    }
    
//    @Override
//    protected boolean checkNumberOfParameters(int numberOfParameters) {
//        return numberOfParameters == 0 || numberOfParameters == 1;
//    }
    
    @Override
    public boolean checkParameterValues(IOutputter outputter) {
        return true;
    }

    @Override
    public void execute(IOutputter outputter) {
    }
}
