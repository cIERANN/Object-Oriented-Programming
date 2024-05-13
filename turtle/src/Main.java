import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

import static java.awt.Color.*;

public class Main extends OOPGraphics {

    private int startX;
    private int startY;

    public static void main(String[] args) {
        new Main(); //create instance of class that extends OOPGraphics (could be separate class without main), gets out of static context
    }

    public Main() {
        JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                                               //set the frame to a size we can see
        MainFrame.setVisible(true);                             //now display it

    }
    @Override
    public void about() {
        super.about();
        System.out.println("This application was created by Cieran Potenciano.");

    }




    public void processCommand(String command)      //this method must be provided because OOPGraphics will call it when it's JTextField is used
    {
        System.out.println("command typed was: " + command);

        String[] parts = command.split(" ");
        String cmd = parts[0];

        if (parts.length > 1) {try {
                int parameter = Integer.parseInt(parts[1]);
                switch (cmd) {
                    case "forward":
                        forward(parameter);
                        break;
                    case "backward":
                        forward(-parameter);
                        break;
                    case "right":
                        turnRight(parameter);
                        break;
                    case "left":
                        turnLeft(parameter);
                        break;
                    case "square":
                        square(parameter);
                    case "penwidth":
                        setStroke(parameter);
                    case "pencolor":
                        if (parts.length == 4) {
                            int r = Integer.parseInt(parts[1]);
                            int g = Integer.parseInt(parts[2]);
                            int b = Integer.parseInt(parts[3]);
                            setPenColour(new Color(r,g,b));
                        } else {
                            System.out.println("Invalid number of parameters for pen command: " + command);
                        }
                        break;
                    default:
                        System.out.println("Invalid command: " + command);
                }
            } catch (NumberFormatException e) {
                System.out.println("Non-numeric parameter used for command: " + command);
            }
        } else {
            switch (cmd) {
                case "penup":
                    penUp();
                    break;
                case "pendown":
                    penDown();
                    break;
                case "forward":
                    forward(100);
                    System.out.println("missing parameter, assumed base values");
                    break;
                case "backward":
                    forward(-100);
                    System.out.println("missing parameter, assumed base values");
                    break;
                case "right":
                    turnRight();
                    System.out.println("missing parameter, assumed base values");
                    break;
                case "left":
                    turnLeft();
                    System.out.println("missing parameter, assumed base values");
                    break;
                case "clear":
                    clear();
                    break;
                case "reset":
                    reset();
                    break;
                case "about":
                    about();
                    break;
                case "black":
                    setPenColour(black);
                    break;
                case "blue":
                    setPenColour(blue);
                    break;
                case "green":
                    setPenColour(green);
                    break;
                case "red":
                    setPenColour(red);
                    break;
                case "white":
                    setPenColour(white);
                    break;
                case "save":
                    saveImage();
                    break;
                case "load":
                    loadImage();
                    break;
                case "square":
                    square(100);
                    System.out.println("missing parameter, assumed base values");
                    break;
                case "triangle":
                    triangle(100);
                    System.out.println("missing parameter, assumed base values");
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }
    }
    private void square(int parameter) {
        startX = xPos;
        startY = yPos;

        for (int i = 0; i < 4; i++) {
            penDown();
            forward(parameter);
            turnRight(90);
        }
        setxPos(xPos);
        setyPos(yPos);
    }
    private void triangle(int parameter) {
        startX = xPos;
        startY = yPos;

        for (int i = 0; i < 3; i++) {
            penDown();
            forward(parameter);
            turnRight(120);
        }
        setxPos(xPos);
        setyPos(yPos);
    }


    private void saveImage() {
        BufferedImage image = getBufferedImage();
        try {
            File file = new File("turtle_image.png");
            ImageIO.write(image, "png", file);
            System.out.println("Image saved as turtle_image.png");
        } catch (Exception e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }
    private void loadImage() {
        clear();
        BufferedImage image;
        try {
            image = ImageIO.read(new File("turtle_image.png"));
            setBufferedImage(image);
            System.out.println("Image loaded from turtle_image.png");
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
    }

}