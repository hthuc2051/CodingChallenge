package com.fsoft.codingchallenge.constants;

public class Messages {

    // Command
    public static String MSG_ENTER = "Enter command: ";
    public static String MSG_QUIT = "Quit program !";
    public static String MSG_COMMAND_ERROR = "Input incorrect command format";
    public static String MSG_CANVAS_NOT_CREATED = "Canvas has not been created";

    // Dimension
    public static String MSG_DIMENSION_NULL = "Dimension of canvas can not be null";
    public static String MSG_INVALID_CANVAS_WIDTH = "Invalid canvas width: ";
    public static String MSG_INVALID_CANVAS_HEIGHT = "Invalid canvas height: ";
    public static String MSG_CANVAS_CREATED = "Canvas has been created !";


    public static final String description =
            "----------- \n"
            + "The program allows these functions:\n"
            + "1. Create a new canvas \n"
            + "2. Draw on the canvas by issuing various commands \n"
            + "3. Quit \n\n\n"
            + "|Command 		|Description|\n"
            + "|----|----|\n"
            + "|C w h          | Create a new canvas of width w and height h.|\n"
            + "|L x1 y1 x2 y2  | Draw a new line from (x1,y1) to (x2,y2). Currently, only|\n"
            + "|               | horizontal or vertical lines are supported. Horizontal and vertical lines|\n"
            + "|               | will be drawn using the 'x' character.|\n"
            + "|R x1 y1 x2 y2  | Draw a rectangle whose upper left corner is (x1,y1) and|\n"
            + "|               | lower right corner is (x2,y2). Horizontal and vertical lines will be drawn|\n"
            + "|               | using the 'x' character.|\n"
            + "|B x y c        | Fill the entire area connected to (x,y) with \"colour\" c. The|\n"
            + "|               | behaviour of this is the same as that of the \"bucket fill\" tool in paint|\n"
            + "|               | programs.|\n"
            + "|Q              | Quit|\n"
            + "----------- \n";
}
