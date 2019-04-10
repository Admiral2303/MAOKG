
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Bear extends Application {
    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 1200, 600);

        // head

        Path path = new Path();
        MoveTo moveTo = new MoveTo();
        moveTo.setX(160);
        moveTo.setY(34);

        LineTo head1 = new LineTo();
        head1.setX(177);
        head1.setY(31);


        QuadCurveTo head2 = new QuadCurveTo();
        head2.setControlX(215);
        head2.setControlY(13);
        head2.setX(231);
        head2.setY(13);

        LineTo headline = new LineTo();
        headline.setY(11);
        headline.setX(227);

        LineTo headline1 = new LineTo();
        headline1.setY(13);
        headline1.setX(232);

        LineTo headline2 = new LineTo();
        headline2.setY(13);
        headline2.setX(241);

        LineTo headline_1 = new LineTo();
        headline_1.setX(268);
        headline_1.setY(34);


        MoveTo moveTo2 = new MoveTo();
        moveTo2.setX(267);
        moveTo2.setY(33);

        QuadCurveTo head3 = new QuadCurveTo();
        head3.setControlX(296);
        head3.setControlY(55);
        head3.setX(276);
        head3.setY(89);

        QuadCurveTo head4 = new QuadCurveTo();
        head4.setControlX(274);
        head4.setControlY(96);
        head4.setX(277);
        head4.setY(100);

        QuadCurveTo head5 = new QuadCurveTo();
        head5.setControlX(246);
        head5.setControlY(101);
        head5.setX(210);
        head5.setY(118);

        QuadCurveTo head6 = new QuadCurveTo();
        head6.setControlX(194);
        head6.setControlY(126);
        head6.setX(180);
        head6.setY(126);

        LineTo headline3 = new LineTo();
        headline3.setX(145);
        headline3.setY(91);

        QuadCurveTo head7 = new QuadCurveTo();
        head7.setControlX(138);
        head7.setControlY(72);
        head7.setX(151);
        head7.setY(64);

        //nose
        QuadCurveTo head8 = new QuadCurveTo();
        head8.setControlX(145);
        head8.setControlY(51);
        head8.setX(163);
        head8.setY(55);

        QuadCurveTo head9 = new QuadCurveTo();
        head9.setControlX(164);
        head9.setControlY(52);
        head9.setX(156);
        head9.setY(43);

        QuadCurveTo head10 = new QuadCurveTo();
        head10.setControlX(150);
        head10.setControlY(35);
        head10.setX(160);
        head10.setY(34);

        path.getElements().add(moveTo);
        path.getElements().add(head1);
        path.getElements().add(head2);
        path.getElements().add(headline);
        path.getElements().add(headline1);
        path.getElements().add(headline2);
        path.getElements().add(headline_1);



        path.getElements().add(moveTo2);
        path.getElements().add(head3);
        path.getElements().add(head4);
        path.getElements().add(head5);
        path.getElements().add(head6);
        path.getElements().add(headline3);
        path.getElements().add(head7);
        path.getElements().add(head8);
        path.getElements().add(head9);
        path.getElements().add(head10);


        path.setFill(Color.rgb(254, 197, 59));
        path.setStrokeWidth(2);
        root.getChildren().add(path);


        //right Ear
        MoveTo moveTo1 = new MoveTo();
        moveTo1.setX(247);
        moveTo1.setY(25);

        QuadCurveTo rightEar1 = new QuadCurveTo();
        rightEar1.setControlX(233);
        rightEar1.setControlY(10);
        rightEar1.setX(250);
        rightEar1.setY(0);

        QuadCurveTo rightEar2 = new QuadCurveTo();
        rightEar2.setControlX(281);
        rightEar2.setControlY(4);
        rightEar2.setX(266);
        rightEar2.setY(36);

        Path rightEar = new Path();

        rightEar.getElements().add(moveTo1);
        rightEar.getElements().add(rightEar1);
        rightEar.getElements().add(rightEar2);

        rightEar.setFill(Color.rgb(254, 197, 59));
        rightEar.setStrokeWidth(2);

        root.getChildren().add(rightEar);


        //left Ear
        MoveTo moveTo3 = new MoveTo();
        moveTo3.setX(194);
        moveTo3.setY(22);

        QuadCurveTo leftEar1 = new QuadCurveTo();
        leftEar1.setControlX(175);
        leftEar1.setControlY(11);
        leftEar1.setX(202);
        leftEar1.setY(8);

        QuadCurveTo leftEar2 = new QuadCurveTo();
        leftEar2.setControlX(215);
        leftEar2.setControlY(6);
        leftEar2.setX(215);
        leftEar2.setY(15);


        Path leftEar = new Path();

        leftEar.getElements().add(moveTo3);
        leftEar.getElements().add(leftEar1);
        leftEar.getElements().add(leftEar2);

        leftEar.setFill(Color.rgb(254, 197, 59));
        leftEar.setStrokeWidth(2);

        root.getChildren().add(leftEar);

        //nose

        MoveTo moveTo4 = new MoveTo();
        moveTo4.setX(152);
        moveTo4.setY(64);

        QuadCurveTo nose1 = new QuadCurveTo();
        nose1.setControlX(145);
        nose1.setControlY(51);
        nose1.setX(163);
        nose1.setY(55);

        QuadCurveTo nose2 = new QuadCurveTo();
        nose2.setControlX(172);
        nose2.setControlY(60);
        nose2.setX(160);
        nose2.setY(68);

        QuadCurveTo nose3 = new QuadCurveTo();
        nose3.setControlX(155);
        nose3.setControlY(68);
        nose3.setX(152);
        nose3.setY(64);


        Path nose = new Path();

        nose.getElements().add(moveTo4);
        nose.getElements().add(nose1);
        nose.getElements().add(nose2);
        nose.getElements().add(nose3);


        nose.setFill(Color.rgb(0, 0, 0));
        nose.setStrokeWidth(2);

        root.getChildren().add(nose);

        //mouse
        Path mouse = new Path();

        MoveTo moveTo5 = new MoveTo();
        moveTo5.setX(153);
        moveTo5.setY(67);

        QuadCurveTo mouse1 = new QuadCurveTo();
        mouse1.setControlX(159);
        mouse1.setControlY(115);
        mouse1.setX(205);
        mouse1.setY(71);

        QuadCurveTo mouse2 = new QuadCurveTo();
        mouse2.setControlX(159);
        mouse2.setControlY(115);
        mouse2.setX(153);
        mouse2.setY(67);

        mouse.getElements().add(moveTo5);
        mouse.getElements().add(mouse1);
        mouse.getElements().add(mouse2);


        mouse.setFill(Color.rgb(0, 0, 0));
        mouse.setStrokeWidth(2);

        root.getChildren().add(mouse);

        Line mouseLine = new Line();
        mouseLine.setStartX(201);
        mouseLine.setStartY(71);
        mouseLine.setEndX(210);
        mouseLine.setEndY(70);
        mouseLine.setStrokeWidth(1);
        mouseLine.setFill(Color.rgb(0, 0, 0));
        root.getChildren().add(mouseLine);

        Path underMouse = new Path();
        MoveTo moveTo6 = new MoveTo(169, 96);
        QuadCurveTo underMouse1 = new QuadCurveTo(172,102,179,105);
        QuadCurveTo underMouse2 = new QuadCurveTo(173,101,169, 96);

        underMouse.getElements().add(moveTo6);
        underMouse.getElements().add(underMouse1);
        underMouse.getElements().add(underMouse2);
        underMouse.setFill(Color.rgb(0, 0, 0));
        underMouse.setStrokeWidth(1);

        root.getChildren().add(underMouse);


        Path underEye = new Path();
        MoveTo moveTo7 = new MoveTo(163, 55);
        QuadCurveTo underEye1 = new QuadCurveTo(172,53,182,56);
        QuadCurveTo underEye2 = new QuadCurveTo(173,54,163, 55);

        underEye.getElements().add(moveTo7);
        underEye.getElements().add(underEye1);
        underEye.getElements().add(underEye2);
        underEye.setFill(Color.rgb(0, 0, 0));
        underEye.setStrokeWidth(1);
        root.getChildren().add(underEye);

        Ellipse eye1 = new Ellipse(172, 50, 3, 4);
        eye1.setStroke(Color.BLACK);
        eye1.setStrokeWidth(1);
        eye1.setFill(Color.BLACK);
        root.getChildren().add(eye1);

        Path nearEye = new Path();
        MoveTo moveTo8 = new MoveTo(176, 41);
        QuadCurveTo nearEye1 = new QuadCurveTo(179,49,179,53);
        QuadCurveTo nearEye2 = new QuadCurveTo(180,50,176, 41);

        nearEye.getElements().add(moveTo8);
        nearEye.getElements().add(nearEye1);
        nearEye.getElements().add(nearEye2);
        nearEye.setFill(Color.rgb(0, 0, 0));
        nearEye.setStrokeWidth(1);
        root.getChildren().add(nearEye);


        Path nearRightEye = new Path();
        MoveTo moveTo9 = new MoveTo(200, 54);
        QuadCurveTo nearRightEye1 = new QuadCurveTo(205,49,211,48);
        QuadCurveTo nearRightEye2 = new QuadCurveTo(205,48,200,54);

        nearRightEye.getElements().add(moveTo9);
        nearRightEye.getElements().add(nearRightEye1);
        nearRightEye.getElements().add(nearRightEye2);
        nearRightEye.setFill(Color.rgb(0, 0, 0));
        nearRightEye.setStrokeWidth(1);
        root.getChildren().add(nearRightEye);

        Ellipse eye2 = new Ellipse(203, 47, 3, 4);
        eye2.setStroke(Color.BLACK);
        eye2.setStrokeWidth(1);
        eye2.setFill(Color.BLACK);
        root.getChildren().add(eye2);


        Path leftBrow = new Path();
        MoveTo moveTo10 = new MoveTo(162,45);
        QuadCurveTo leftBrow1 = new QuadCurveTo(163,38,170,37);
        QuadCurveTo leftBrow2 = new QuadCurveTo(160,36,162,45);

        leftBrow.getElements().add(moveTo10);
        leftBrow.getElements().add(leftBrow1);
        leftBrow.getElements().add(leftBrow2);
        leftBrow.setFill(Color.rgb(0, 0, 0));
        leftBrow.setStrokeWidth(1);
        root.getChildren().add(leftBrow);

        Path rightBrow = new Path();
        MoveTo moveTo11 = new MoveTo(215,34);
        QuadCurveTo rightBrow1 = new QuadCurveTo(208,25,200,28);
        QuadCurveTo rightBrow2 = new QuadCurveTo(210,22,215,34);

        rightBrow.getElements().add(moveTo11);
        rightBrow.getElements().add(rightBrow1);
        rightBrow.getElements().add(rightBrow2);
        rightBrow.setFill(Color.rgb(0, 0, 0));
        rightBrow.setStrokeWidth(1);
        root.getChildren().add(rightBrow);


        //body
        Path body = new Path();
        MoveTo moveTo12 = new MoveTo(130,113);
        QuadCurveTo body1 = new QuadCurveTo(142,108,152,99);
        LineTo body2 = new LineTo(170,118);
        QuadCurveTo body3 = new QuadCurveTo(169,126,179,127);
        QuadCurveTo body4 = new QuadCurveTo(217,109,252,102);
        LineTo body5 = new LineTo(277,101);
        QuadCurveTo body6 = new QuadCurveTo(273,96,276,93);
        QuadCurveTo body7 = new QuadCurveTo(285,95,288,101);
        LineTo body8 = new LineTo(283,112);
        QuadCurveTo body9 = new QuadCurveTo(294,120,284,135);
        QuadCurveTo body10 = new QuadCurveTo(280,144,295,159);
        QuadCurveTo body11 = new QuadCurveTo(292,165,286,166);
        LineTo body12 = new LineTo(285,163);
        QuadCurveTo body13 = new QuadCurveTo(266,175,243,175);
        QuadCurveTo body14 = new QuadCurveTo(242,186,247,199);
        QuadCurveTo body15 = new QuadCurveTo(242,203,241,219);
        LineTo body16 = new LineTo(223,217);
        LineTo body17 = new LineTo(230,209);
        QuadCurveTo body18 = new QuadCurveTo(194,143,147,125);
        QuadCurveTo body19 = new QuadCurveTo(141,123,132,127);

        LineTo body101 = new LineTo(130,113);


        body.getElements().add(moveTo12);
        body.getElements().add(body1);
        body.getElements().add(body2);
        body.getElements().add(body3);
        body.getElements().add(body4);
        body.getElements().add(body5);
        body.getElements().add(body6);
        body.getElements().add(body7);
        body.getElements().add(body8);
        body.getElements().add(body9);
        body.getElements().add(body10);
        body.getElements().add(body11);
        body.getElements().add(body12);
        body.getElements().add(body13);
        body.getElements().add(body14);
        body.getElements().add(body15);
        body.getElements().add(body16);
        body.getElements().add(body17);
        body.getElements().add(body18);
        body.getElements().add(body19);


        body.getElements().add(body101);




        body.setFill(Color.rgb(185, 0, 0));
        body.setStrokeWidth(2);
        root.getChildren().add(body);


        Path body_1 = new Path();
        MoveTo moveTo13 = new MoveTo(240,174);
        QuadCurveTo body20 = new QuadCurveTo(236,123,261,117);
        QuadCurveTo body21 = new QuadCurveTo(236,123,240,174);

        body_1.getElements().add(moveTo13);
        body_1.getElements().add(body20);
        body_1.getElements().add(body21);


        body_1.setFill(Color.rgb(0, 0, 0));
        body_1.setStrokeWidth(2);
        root.getChildren().add(body_1);

        Path body_2 = new Path();
        MoveTo moveTo14 = new MoveTo(229,119);
        QuadCurveTo body22 = new QuadCurveTo(248,106,273, 106);
        QuadCurveTo body23 = new QuadCurveTo(248,106,229,119);

        body_2.getElements().add(moveTo14);
        body_2.getElements().add(body22);
        body_2.getElements().add(body23);


        body_2.setFill(Color.rgb(0, 0, 0));
        body_2.setStrokeWidth(2);
        root.getChildren().add(body_2);

        //belly

        Path belly = new Path();
        MoveTo moveTo15 = new MoveTo(131,127);
        QuadCurveTo belly1 = new QuadCurveTo(33,171,104,239);
        QuadCurveTo belly2 = new QuadCurveTo(158,200,177,225);
        QuadCurveTo belly3 = new QuadCurveTo(183,230,170,249);
        QuadCurveTo belly4 = new QuadCurveTo(205,236,230,211);
        QuadCurveTo belly5 = new QuadCurveTo(192,141,147,125);
        QuadCurveTo belly6 = new QuadCurveTo(136,124,131,127);


        belly.getElements().add(moveTo15);
        belly.getElements().add(belly1);
        belly.getElements().add(belly2);
        belly.getElements().add(belly3);
        belly.getElements().add(belly4);
        belly.getElements().add(belly5);
        belly.getElements().add(belly6);


        belly.setFill(Color.rgb(254, 197, 59));
        belly.setStrokeWidth(2);
        root.getChildren().add(belly);


        //right hand

        Path rightHand = new Path();
        MoveTo moveTo16 = new MoveTo(243,175);
        QuadCurveTo rightHand1 = new QuadCurveTo(234,212,276, 238);
        QuadCurveTo rightHand2 = new QuadCurveTo(312,228,305,220);
        QuadCurveTo rightHand3 = new QuadCurveTo(300,215,292, 215);
        QuadCurveTo rightHand4 = new QuadCurveTo(284,188,286, 162);
        QuadCurveTo rightHand5 = new QuadCurveTo(276,170,261,174);


        rightHand.getElements().add(moveTo16);
        rightHand.getElements().add(rightHand1);
        rightHand.getElements().add(rightHand2);
        rightHand.getElements().add(rightHand3);
        rightHand.getElements().add(rightHand4);
        rightHand.getElements().add(rightHand5);



        rightHand.setFill(Color.rgb(254, 197, 59));
        rightHand.setStrokeWidth(2);
        root.getChildren().add(rightHand);


        //right leg

        Path rightleg = new Path();
        MoveTo moveTo17 = new MoveTo(179,230);
        QuadCurveTo rightleg1 = new QuadCurveTo(189,251,139,266);
        LineTo rightleg1_1 = new LineTo(75,293);
        QuadCurveTo rightleg2 = new QuadCurveTo(66,294,62,282);
        LineTo rightleg2_2 = new LineTo(60,247);

        QuadCurveTo rightleg3 = new QuadCurveTo(78,228,98,244);
        QuadCurveTo rightleg4 = new QuadCurveTo(159,181,179,230);


        rightleg.getElements().add(moveTo17);
        rightleg.getElements().add(rightleg1);
        rightleg.getElements().add(rightleg1_1);


        rightleg.getElements().add(rightleg2);
        rightleg.getElements().add(rightleg2_2);

        rightleg.getElements().add(rightleg3);
        rightleg.getElements().add(rightleg4);


        rightleg.setFill(Color.rgb(254, 197, 59));
        rightleg.setStrokeWidth(2);
        root.getChildren().add(rightleg);

        Ellipse rightLeg1 = new Ellipse(68,265, 9, 23);
        rightLeg1.setStroke(Color.BLACK);
        rightLeg1.setStrokeWidth(2);
        rightLeg1.setFill(Color.rgb(241,156,7));
        root.getChildren().add(rightLeg1);


        Path rightLegLine = new Path();
        MoveTo moveTo18 = new MoveTo(97,244);
        QuadCurveTo rightLegLine1 = new QuadCurveTo(102,255,94,275);
        QuadCurveTo rightLegLine2 = new QuadCurveTo(102,255,97,244);

        rightLegLine.getElements().add(moveTo18);
        rightLegLine.getElements().add(rightLegLine1);
        rightLegLine.getElements().add(rightLegLine2);
        rightLegLine.setFill(Color.rgb(0, 0, 0));
        rightLegLine.setStrokeWidth(2);
        root.getChildren().add(rightLegLine);


        //left leg

        Path leftleg = new Path();
        MoveTo moveTo19 = new MoveTo(76,173);
        QuadCurveTo leftleg1 = new QuadCurveTo(60,170,34,185);

        QuadCurveTo leftleg2 = new QuadCurveTo(32,156,20,159);

        QuadCurveTo leftleg3 = new QuadCurveTo(7,158,3,167);
        LineTo leftleg4 = new LineTo(1,209);

        QuadCurveTo leftleg5 = new QuadCurveTo(4,219,14,218);
        QuadCurveTo leftleg6 = new QuadCurveTo(50,213,86,218);
        QuadCurveTo leftleg7 = new QuadCurveTo(67,196,76,173);


        rightleg.getElements().add(moveTo19);
        rightleg.getElements().add(leftleg1);
        rightleg.getElements().add(leftleg2);


        rightleg.getElements().add(leftleg3);
        rightleg.getElements().add(leftleg4);

        rightleg.getElements().add(leftleg5);
        rightleg.getElements().add(leftleg6);
        rightleg.getElements().add(leftleg7);



        leftleg.setFill(Color.rgb(254, 197, 59));
        leftleg.setStrokeWidth(2);
        root.getChildren().add(leftleg);

        Ellipse leftLeg1 = new Ellipse(6,190, 4, 22);
        leftLeg1.setStroke(Color.BLACK);
        leftLeg1.setStrokeWidth(2);
        leftLeg1.setFill(Color.rgb(241,156,7));
        root.getChildren().add(leftLeg1);


        Path leftHand = new Path();
        MoveTo moveTo20 = new MoveTo(120,132);
        QuadCurveTo leftHand1 = new QuadCurveTo(127,123,132,120);
        QuadCurveTo leftHand2 = new QuadCurveTo(133,124,132,127);
        QuadCurveTo leftHand3 = new QuadCurveTo(129,130,120,132);


        leftHand.getElements().add(moveTo20);
        leftHand.getElements().add(leftHand1);
        leftHand.getElements().add(leftHand2);
        leftHand.getElements().add(leftHand3);

        leftHand.setFill(Color.rgb(254, 197, 59));
        leftHand.setStrokeWidth(2);
        root.getChildren().add(leftHand);



        // Animation
        int cycleCount = 2; //
        int time = 4000;

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(time), root);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setCycleCount(cycleCount);
        scaleTransition.setAutoReverse(true);


        RotateTransition rotateTransition = new RotateTransition(Duration.millis(time), root);
        rotateTransition.setByAngle(180);
        rotateTransition.setCycleCount(cycleCount);
        rotateTransition.setAutoReverse(true);


        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(time), root);
        translateTransition.setFromX(10);
        translateTransition.setToX(600);
        translateTransition.setCycleCount(cycleCount+2);
        translateTransition.setAutoReverse(true);

        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.millis(time), root);
        scaleTransition2.setToX(0.5);
        scaleTransition2.setToY(0.5);
        scaleTransition2.setCycleCount(cycleCount);
        scaleTransition2.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                scaleTransition,
                translateTransition,
                rotateTransition,
                scaleTransition2
        );

        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();

        primaryStage.setTitle("Lab3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
