import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.vecmath.Color3f;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Cylinder;

import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;

import java.awt.*;

public class XMassTree {

    public static Box getBox(float xDim, float yDim, float zDim) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Box(xDim, yDim, zDim, primflags, getXMassTreeAppearence());
    }

    public static Box getBox1(float xDim, float yDim, float zDim) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Box(xDim, yDim, zDim, primflags, getXMassTreeAppearence2());
    }

    public static Box getBox2(float xDim, float yDim, float zDim) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Box(xDim, yDim, zDim, primflags, getXMassTreeAppearence3());
    }

    public static Sphere getSphere(float radius) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Sphere(radius, primflags, getXMassTreeAppearence4());
    }


    public static Cylinder getCylinder(float radius, float height) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Cylinder(radius, height, primflags, getXMassTreeAppearence1());
    }

    private static Appearance getXMassTreeAppearence() {
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(0.0f, 0.05f, 0.0f);
        Color3f ambient = new Color3f(0.2f, 0.5f, 0.15f);
        Color3f diffuse = new Color3f(0.2f, 0.15f, .15f);
        Color3f specular = new Color3f(0.0f, 0.8f, 0.0f);
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));
        return ap;
    }

    private static Appearance getXMassTreeAppearence1() {
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(new Color(0,0, 0));
        Color3f ambient = new Color3f(new Color(100,38, 38));
        Color3f diffuse = new Color3f(new Color(46,2, 2));
        Color3f specular = new Color3f(new Color(0,0, 0));
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));
        return ap;
    }


    private static Appearance getXMassTreeAppearence2() {
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(new Color(200,200,200));
        Color3f ambient = new Color3f(new Color(180,150,180));
        Color3f diffuse = new Color3f(new Color(240,250,198));
        Color3f specular = new Color3f(new Color(0,0, 0));
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));
        return ap;
    }

    private static Appearance getXMassTreeAppearence3() {
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(new Color(98,200, 25));
        Color3f ambient = new Color3f(new Color(100,180, 38));
        Color3f diffuse = new Color3f(new Color(78,200, 2));
        Color3f specular = new Color3f(new Color(0,0, 0));
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));
        return ap;
    }

    private static Appearance getXMassTreeAppearence4() {
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(new Color(255,255,255));
        Color3f ambient = new Color3f(new Color(240,240,240));
        Color3f diffuse = new Color3f(new Color(230,225,214));
        Color3f specular = new Color3f(new Color(0,0, 0));
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));
        return ap;
    }
}