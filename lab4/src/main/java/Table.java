
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.*;
import javax.swing.Timer;
import javax.vecmath.*;

public class Table implements ActionListener {
    private TransformGroup viewingTransformGroup;
    private TransformGroup tableTransformGroup;
    private Transform3D treeTransform3D = new Transform3D();
    private Transform3D viewingTransform = new Transform3D();
    private float angle = 0;

    public static void main(String[] args) {
        new Table();
    }

    private Table() {
        Timer timer = new Timer(50, this);
        SimpleUniverse universe = new SimpleUniverse();

        viewingTransformGroup = universe.getViewingPlatform().getViewPlatformTransform();
        universe.addBranchGraph(createSceneGraph());

        timer.start();
    }

    private BranchGroup createSceneGraph() {
        BranchGroup objRoot = new BranchGroup();

        tableTransformGroup = new TransformGroup();
        tableTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        buildTable();
        objRoot.addChild(tableTransformGroup);

        Background background = new Background(new Color3f(new Color(98,100, 100))); // white color
        BoundingSphere sphere = new BoundingSphere(new Point3d(0,0,0), 100000);
        background.setApplicationBounds(sphere);
        objRoot.addChild(background);

        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0),100.0);
        Color3f light1Color = new Color3f(1.0f, 0.5f, 0.4f);
        Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
        DirectionalLight light1 = new DirectionalLight(light1Color, light1Direction);
        light1.setInfluencingBounds(bounds);
        objRoot.addChild(light1);

        Color3f ambientColor = new Color3f(1.0f, 1.0f, 1.0f);
        AmbientLight ambientLightNode = new AmbientLight(ambientColor);
        ambientLightNode.setInfluencingBounds(bounds);
        objRoot.addChild(ambientLightNode);
        return objRoot;
    }

    private void buildTable() {
        //table
        TransformGroup tgTop = new TransformGroup();
        Transform3D transformTop = new Transform3D();
        Box table = XMassTree.getBox(0.4f, 0.01f, 0.8f);
        Vector3f vectorTop = new Vector3f(.0f, 0.2f, .0f);
        transformTop.setTranslation(vectorTop);
        tgTop.setTransform(transformTop);
        tgTop.addChild(table);
        tableTransformGroup.addChild(tgTop);

        TransformGroup tgTop2 = new TransformGroup();
        Transform3D transformTop2 = new Transform3D();
        Box table2 = XMassTree.getBox2(0.3f, 0.001f, 0.6f);
        Vector3f vectorTop2 = new Vector3f(.0f, 0.21f, .0f);
        transformTop2.setTranslation(vectorTop2);
        tgTop2.setTransform(transformTop2);
        tgTop2.addChild(table2);
        tableTransformGroup.addChild(tgTop2);

        //ball
        TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        Sphere cone = XMassTree.getSphere(0.02f);
        Vector3f vector = new Vector3f(.0f, 0.22f, 0.7f);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(cone);
        tableTransformGroup.addChild(tg);

        //leg1
        TransformGroup tgBottom = new TransformGroup();
        Transform3D transformBottom = new Transform3D();
        Cylinder tableLeg = XMassTree.getCylinder(0.01f, 0.4f);
        Vector3f vectorBottom = new Vector3f(0.3f, .0f, 0.7f);
        transformBottom.setTranslation(vectorBottom);
        tgBottom.setTransform(transformBottom);
        tgBottom.addChild(tableLeg);
        tableTransformGroup.addChild(tgBottom);

        //leg2
        TransformGroup tgBottom1 = new TransformGroup();
        Transform3D transformBottom1 = new Transform3D();
        Cylinder tableLeg1 = XMassTree.getCylinder(0.01f, 0.4f);
        Vector3f vectorBottom1 = new Vector3f(-0.3f, .0f, 0.7f);
        transformBottom1.setTranslation(vectorBottom1);
        tgBottom1.setTransform(transformBottom1);
        tgBottom1.addChild(tableLeg1);
        tableTransformGroup.addChild(tgBottom1);

        //leg3
        TransformGroup tgBottom2 = new TransformGroup();
        Transform3D transformBottom2 = new Transform3D();
        Cylinder tableLeg2 = XMassTree.getCylinder(0.01f, 0.4f);
        Vector3f vectorBottom2 = new Vector3f(0.3f, .0f, -0.7f);
        transformBottom2.setTranslation(vectorBottom2);
        tgBottom2.setTransform(transformBottom2);
        tgBottom2.addChild(tableLeg2);
        tableTransformGroup.addChild(tgBottom2);

        //leg4
        TransformGroup tgBottom3 = new TransformGroup();
        Transform3D transformBottom3 = new Transform3D();
        Cylinder tableLeg3 = XMassTree.getCylinder(0.01f, 0.4f);
        Vector3f vectorBottom3 = new Vector3f(-0.3f, .0f, -0.7f);
        transformBottom3.setTranslation(vectorBottom3);
        tgBottom3.setTransform(transformBottom3);
        tgBottom3.addChild(tableLeg3);
        tableTransformGroup.addChild(tgBottom3);


        for(int i = 1; i < 5; i++) {
            creatNet(0.45f, 0.001f, .0f, 0.221f + 0.02f * i, .0f);
        }

        for(int i = 2; i < 49; i++) {
            creatNet(0.001f, 0.031f, -0.5f + 0.02f * i, 0.271f, .0f);
        }
    }


    // ActionListener interface
    public void actionPerformed(ActionEvent e) {
        float delta = 0.03f;

        // rotation of the castle
        treeTransform3D.rotY(angle);
        tableTransformGroup.setTransform(treeTransform3D);
        angle += delta;


        Point3d eye = new Point3d(0.0f, 2.0f, 3.0f); // spectator's eye
        Point3d center = new Point3d(.0f, .0f ,0.5f); // sight target
        Vector3d up = new Vector3d(.0f, 5.0f, .0f); // the camera frustum
        viewingTransform.lookAt(eye, center, up);
        viewingTransform.invert();
        viewingTransformGroup.setTransform(viewingTransform);
    }

    private void creatNet(float width, float height, float x, float y, float z) {
        TransformGroup tgTop1 = new TransformGroup();
        Transform3D transformTop1 = new Transform3D();
        Box net = XMassTree.getBox1(width, height, 0.002f);
        Vector3f vectorTop1 = new Vector3f(x, y, z);
        transformTop1.setTranslation(vectorTop1);
        tgTop1.setTransform(transformTop1);
        tgTop1.addChild(net);
        tableTransformGroup.addChild(tgTop1);
    }

}

