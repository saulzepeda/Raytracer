/**
 * [1968] - [2020] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package up.edu.isgc.raytracer;

import up.edu.isgc.raytracer.lights.DirectionalLight;
import up.edu.isgc.raytracer.lights.Light;
import up.edu.isgc.raytracer.lights.PointLight;
import up.edu.isgc.raytracer.objects.*;
import up.edu.isgc.raytracer.tools.OBJReader;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Jafet Rodríguez
 * @author Saúl Zepeda
 */
public class Raytracer {
    static double shininess = 100;

    public static void main(String[] args) {
        Scene scene01 = new Scene();
        scene01.setCamera(new Camera(new Vector3D(0, 0, -8), 160, 160, 1200, 1200, 8.2f, 50f));

        scene01.addLight(new PointLight(new Vector3D(-2f, 2f, 1f), Color.WHITE, 3));
        scene01.addLight(new PointLight(new Vector3D(0f, 2f, -3f), Color.WHITE, 1.5));
        scene01.addLight(new PointLight(new Vector3D(-2f, 2f, 10f), Color.WHITE, 1.5));
        /*scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-3f, -3f, 0f), Color.WHITE,
                0.05,1,1,10, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-1f, -3f, 0f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(1f, -3f, 0f), Color.WHITE,
                0.05,1,1,10, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(3f, -3f, 0f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(4f, -3f, 0f), Color.WHITE,
                0.05,1,1,10, 0));*/

        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-3f, -3f, 2f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-1f, -3f, 2f), Color.WHITE,
                0.05,1,1,1, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(1f, -3f, 2f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(3f, -3f, 2f), Color.WHITE,
                0.05,1,1,1, 0));
        /*scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(4f, -3f, 2f), Color.BLACK,
                0.05,1,1,0, 0));*/

        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-3f, -3f, 4f), Color.WHITE,
                0.05,1,1,1, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-1f, -3f, 4f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(1f, -3f, 4f), Color.WHITE,
                0.05,1,1,1, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(3f, -3f, 4f), Color.BLACK,
                0.05,1,1,0, 0));
        /*scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(4f, -3f, 4f), Color.WHITE,
                0.05,1,1,10, 0));*/

        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-3f, -3f, 6f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-1f, -3f, 6f), Color.WHITE,
                0.05,1,1,10, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(1f, -3f, 6f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(3f, -3f, 6f), Color.WHITE,
                0.05,1,1,1, 0));
        /*scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(4f, -3f, 6f), Color.BLACK,
                0.05,1,1,0, 0));*/

        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-3f, -3f, 8f), Color.WHITE,
                0.05,1,1,10, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(-1f, -3f, 8f), Color.BLACK,
                0.05,1,1,0, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(1f, -3f, 8f), Color.WHITE,
                0.05,1,1,10, 0));
        scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(3f, -3f, 8f), Color.BLACK,
                0.05,1,1,0, 0));
        /*scene01.addObject(OBJReader.GetPolygon("piso1.obj", new Vector3D(4f, -3f, 8f), Color.WHITE,
                0.05,1,1,10, 0));*/

        scene01.addObject(OBJReader.GetPolygon("tower.obj", new Vector3D(-3f, -3.4f, 0f), new Color(245, 159, 219),
                0.05,1,1,0, 1.3));



        scene01.addObject(OBJReader.GetPolygon("horseC.obj", new Vector3D(-3f, -3.4f, 4f), new Color(245, 159, 219),
                0.05,1,1,1, 0));


        scene01.addObject(OBJReader.GetPolygon("queen.obj", new Vector3D(-1f, -3.4f, 2.5f), new Color(245, 159, 219),
                0.05,1,1,1, 0));
        scene01.addObject(OBJReader.GetPolygon("peon.obj", new Vector3D(1f, -3.3f, 4f), new Color(150, 236, 255),
                0.05,1,1,1, 1.3));

        System.out.println(new Date());
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        BufferedImage image = raytrace(scene01, executorService);

        executorService.shutdown();
        try{
            if(!executorService.awaitTermination(20, TimeUnit.MINUTES)){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(!executorService.isTerminated()){
                System.err.println("Cancel non-finished");
            }
        }
        executorService.shutdownNow();
        File outputImage = new File("Chess01.png");
        try {
            ImageIO.write(image, "png", outputImage);
        } catch (IOException ioe) {
            System.out.println("Something failed");
        }
        System.out.println(new Date());
    }

    /**
     * Function that makes the image of the scene
     * @param scene
     * @param executorService
     * @return BufferedImage image with all the pixels painted
     */
    public static BufferedImage raytrace(Scene scene, ExecutorService executorService) {
        Camera mainCamera = scene.getCamera();
        ArrayList<Light> lights = scene.getLights();
        //float[] nearFarPlanes = mainCamera.getNearFarPlanes();
        BufferedImage image = new BufferedImage(mainCamera.getResolutionWidth(), mainCamera.getResolutionHeight(), BufferedImage.TYPE_INT_RGB);
        ArrayList<Object3D> objects = scene.getObjects();

        Vector3D[][] positionsToRaytrace = mainCamera.calculatePositionsToRay();
        for (int i = 0; i < positionsToRaytrace.length; i++) {
            for (int j = 0; j < positionsToRaytrace[i].length; j++) {
                Runnable runnable = draw2(i, j, positionsToRaytrace, image, objects, lights, mainCamera);
                executorService.execute(runnable);
            }
        }
        return image;
    }

    /**
     * Function to prevent color values from going out of bounds.
     * @param value
     * @param min
     * @param max
     * @return Float values​between the minimum and maximum given
     */
    public static float clamp(float value, float min, float max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /**
     * Function to add two colors
     * @param original
     * @param otherColor
     * @return Color the sum of two colors
     */
    public static Color addColor(Color original, Color otherColor){
        float red = clamp((original.getRed() / 255.0f) + (otherColor.getRed() / 255.0f), 0, 1);
        float green = clamp((original.getGreen() / 255.0f) + (otherColor.getGreen() / 255.0f), 0, 1);
        float blue = clamp((original.getBlue() / 255.0f) + (otherColor.getBlue() / 255.0f), 0, 1);
        return new Color(red, green, blue);
    }

    /**
     * Function that checks if the given ray collides with any object, and returns the closest intersection.
     * @param ray
     * @param objects
     * @param caster
     * @param clippingPlanes
     * @return Intersection the closest intersection of a ray given.
     */
    public static Intersection raycast(Ray ray, ArrayList<Object3D> objects, Object3D caster, float[] clippingPlanes) {
        Intersection closestIntersection = null;

        for (int k = 0; k < objects.size(); k++) {
            Object3D currentObj = objects.get(k);
            Intersection intersection = currentObj.getIntersection(ray);
            if (caster == null || !currentObj.equals(caster)) {
                if (intersection != null) {
                    double distance = intersection.getDistance();
                    if (distance >= 0 &&
                            (closestIntersection == null || distance < closestIntersection.getDistance()) &&
                            (clippingPlanes == null || (intersection.getPosition().getZ() >= clippingPlanes[0] &&
                                    intersection.getPosition().getZ() <= clippingPlanes[1]))) {
                        closestIntersection = intersection;
                    }
                }
            }
        }

        return closestIntersection;
    }

    public static Intersection raycastShadow(Ray ray, ArrayList<Object3D> objects, float[] clippingPlanes) {
        Intersection closestIntersection = null;

        for (int k = 0; k < objects.size(); k++) {
            Object3D currentObj = objects.get(k);
            Intersection intersection = currentObj.getIntersection(ray);
            if (intersection != null) {
                double distance = intersection.getDistance();
                if (distance >= 0 &&
                        (closestIntersection == null || distance < closestIntersection.getDistance()) &&
                        (clippingPlanes == null || (intersection.getPosition().getZ() >= clippingPlanes[0] &&
                                intersection.getPosition().getZ() <= clippingPlanes[1]))) {
                    closestIntersection = intersection;
                }
            }
        }

        return closestIntersection;
    }

    /**
     * Function that has all the operations to be parallelized.
     * @param i
     * @param j
     * @param positionsToRaytrace
     * @param image
     * @param objects
     * @param lights
     * @param mainCamera
     * @return Runnable to execute in the ExecutorService
     */
    public static Runnable draw2(int i, int j, Vector3D[][] positionsToRaytrace, BufferedImage image, ArrayList<Object3D> objects,
                                 ArrayList<Light> lights, Camera mainCamera){
        Runnable aRunnable = () -> {
            float[] nearFarPlanes = mainCamera.getNearFarPlanes();
            double x = positionsToRaytrace[i][j].getX() + mainCamera.getPosition().getX();
            double y = positionsToRaytrace[i][j].getY() + mainCamera.getPosition().getY();
            double z = positionsToRaytrace[i][j].getZ() + mainCamera.getPosition().getZ();
            Ray ray = new Ray(mainCamera.getPosition(), new Vector3D(x, y, z));
            float cameraZ = (float) mainCamera.getPosition().getZ();
            Intersection closestIntersection = raycast(ray, objects, null, new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});

            //Background color
            Color pixelColor = Color.BLACK;
            if (closestIntersection != null) {
                pixelColor = Color.BLACK;
                for (Light light : lights) {
                    //Lanzar rayo y Checar si choca con más objetos
                    Vector3D originSolved = Vector3D.add(closestIntersection.getPosition(), new Vector3D(0.000000001, 0.000000001, -0.000000001));
                    Ray rayToLight = new Ray(originSolved, Vector3D.substract(light.getPosition(), closestIntersection.getPosition()));
                    Intersection intersectionToLight = raycastShadow(rayToLight, objects, new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});
                    if (intersectionToLight == null){
                        /*AMBIENT*/
                        Color ambient = getAmbient(closestIntersection);
                        pixelColor = addColor(pixelColor, ambient);
                        /*DIFFUSE*/
                        Color diffuse = getDiffuse(closestIntersection, light);
                        pixelColor = addColor(pixelColor, diffuse);
                        /*SPECULAR*/
                        Color specular = getSpecular(closestIntersection, mainCamera, light);
                        pixelColor = addColor(pixelColor, specular);

                        /*REFLECTION*/
                        // R = I−2(N⋅I)*N
                        double CONST_REFLECTION = closestIntersection.getObject().getCONST_REFLECTION();
                        if (CONST_REFLECTION > 0){
                            Vector3D directionI;
                            directionI = Vector3D.substract(closestIntersection.getPosition(), mainCamera.getPosition());
                            Vector3D directionR;
                            directionR = Vector3D.substract(directionI, Vector3D.scalarMultiplication(closestIntersection.getNormal(),
                                    2*Vector3D.dotProduct(closestIntersection.getNormal(), directionI)));

                            Ray rayReflection = new Ray(originSolved, directionR);
                            Intersection reflectionIntersection = raycast(rayReflection, objects, null, new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});
                            if (reflectionIntersection != null){
                                Color reflectionAmbient = getAmbient(reflectionIntersection);
                                Color reflectionDiffuse = getDiffuse(reflectionIntersection, light);
                                Color reflectionSpecular = getSpecular(reflectionIntersection, mainCamera, light);

                                Color objColorCollide = new Color(0,0,0);
                                objColorCollide = addColor(objColorCollide, reflectionAmbient);
                                objColorCollide = addColor(objColorCollide, reflectionDiffuse);
                                objColorCollide = addColor(objColorCollide, reflectionSpecular);

                                //Color objColorCollide = colorReflected;

                                float[] objColorsCollide = new float[]{objColorCollide.getRed() * (float)CONST_REFLECTION / 255.0f,
                                        objColorCollide.getGreen() * (float)CONST_REFLECTION / 255.0f,
                                        objColorCollide.getBlue() * (float)CONST_REFLECTION / 255.0f};

                                Color reflection = new Color(clamp(objColorsCollide[0], 0, 1),
                                        clamp(objColorsCollide[1], 0, 1), clamp(objColorsCollide[2], 0, 1));
                                pixelColor = addColor(pixelColor, reflection);
                            }
                        }
                        /*REFRACTION*/
                        //T=ηI+(ηc1−c2)N
                        //n= 1/n
                        //c1=cos(θ1)=N⋅I,
                        //c2 = sqrt(1−(n1n2)2(1−cos2(θ1)))
                        //cos(θ1)=N⋅I
                        double N_Value = closestIntersection.getObject().getN_Value();
                        if (N_Value != 0){
                            Vector3D directionI = Vector3D.substract(closestIntersection.getPosition(), mainCamera.getPosition());
                            Vector3D directionN = closestIntersection.getNormal();
                            double n = 1/N_Value;
                            double c1 = Vector3D.dotProduct(directionN, directionI);
                            double c2 = Math.sqrt(1-Math.pow(n, 2)*(1-Math.pow(c1, 2)));
                            Vector3D directionT = Vector3D.add(Vector3D.scalarMultiplication(directionI, n), Vector3D.scalarMultiplication(directionN, n*c1-c2));

                            Ray rayRefraction = new Ray(originSolved, directionT);

                            Intersection refractionIntersection = raycast(rayRefraction, objects, closestIntersection.getObject(), new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});
                            if (refractionIntersection != null){
                                Color objColorCollide = new Color(0,0,0);
                                Color refractionAmbient = getAmbient(refractionIntersection);
                                Color refractionDiffuse = getDiffuse(refractionIntersection, light);
                                Color refractionSpecular = getSpecular(refractionIntersection, mainCamera, light);

                                objColorCollide = addColor(objColorCollide, refractionAmbient);
                                objColorCollide = addColor(objColorCollide, refractionDiffuse);
                                objColorCollide = addColor(objColorCollide, refractionSpecular);

                                //Color objColorCollide = colorReflected;

                                float[] objColorsCollide = new float[]{objColorCollide.getRed() / 255.0f,
                                        objColorCollide.getGreen() / 255.0f,
                                        objColorCollide.getBlue() / 255.0f};

                                Color refraction = new Color(clamp(objColorsCollide[0], 0, 1),
                                        clamp(objColorsCollide[1], 0, 1), clamp(objColorsCollide[2], 0, 1));
                                pixelColor = addColor(pixelColor, refraction);
                            }
                        }

                    }
                }
            }

            setRGB(i, j, pixelColor, image);
        };
        return aRunnable;
    }

    /**
     * Function used in the manage od the threads to parallelize the raytrace.
     * @param x
     * @param y
     * @param pixelColor
     * @param image
     */
    public static synchronized void setRGB(int x, int y, Color pixelColor, BufferedImage image){
        image.setRGB(x, y, pixelColor.getRGB());
    }

    /**
     * A function that calculates and returns the Ambient layer of an object at an Intersection
     * @param closestIntersection
     * @return Color Ambient
     */
    public static Color getAmbient(Intersection closestIntersection){
        Color objColor = closestIntersection.getObject().getColor();
        double CONST_AMBIENT = closestIntersection.getObject().getCONST_AMBIENT();
        float[] objColorsAmbient = new float[]{objColor.getRed() * (float)CONST_AMBIENT / 255.0f,
                objColor.getGreen() * (float)CONST_AMBIENT  / 255.0f,
                objColor.getBlue() * (float)CONST_AMBIENT  / 255.0f};

        Color ambient = new Color(clamp(objColorsAmbient[0], 0, 1),
                clamp(objColorsAmbient[1], 0, 1), clamp(objColorsAmbient[2], 0, 1));
        return ambient;
    }

    /**
     * A function that calculates and returns the Diffuse layer of an object at an Intersection
     * @param closestIntersection
     * @param light
     * @return Color Diffuse
     */
    public static Color getDiffuse(Intersection closestIntersection, Light light){
        Color objColor = closestIntersection.getObject().getColor();
        float nDotL = light.getNDotL(closestIntersection);
        /*LightFallOff - Calculate Distance Between the Light and every Object*/
        float distance = (float) Math.sqrt(Math.pow(light.getPosition().getX() - closestIntersection.getPosition().getX(), 2) +
                Math.pow(light.getPosition().getY() - closestIntersection.getPosition().getY(), 2) +
                Math.pow(light.getPosition().getZ() - closestIntersection.getPosition().getZ(), 2));

        float intensity = (float) ((light.getIntensity() / Math.pow(distance, 1)) * nDotL);
        Color lightColor = light.getColor();

        float[] lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
        float[] objColorsDif = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};
        double CONST_DIFFUSE = closestIntersection.getObject().getCONST_DIFFUSE();
        for (int colorIndex = 0; colorIndex < objColorsDif.length; colorIndex++) {
            objColorsDif[colorIndex] *= intensity * lightColors[colorIndex] * CONST_DIFFUSE;
        }

        Color diffuse = new Color(clamp(objColorsDif[0], 0, 1),clamp(objColorsDif[1], 0, 1),clamp(objColorsDif[2], 0, 1));
        return diffuse;
    }

    /**
     * A function that calculates and returns the Specular layer of an object at an Intersection
     * @param closestIntersection
     * @param mainCamera
     * @param light
     * @return Color Specular
     */
    public static Color getSpecular(Intersection closestIntersection, Camera mainCamera, Light light){
        Color objColor = closestIntersection.getObject().getColor();
        Vector3D viewer = Vector3D.normalize(Vector3D.substract(mainCamera.getPosition(), closestIntersection.getPosition()));
        Vector3D lightSource = Vector3D.normalize(Vector3D.substract(light.getPosition(), closestIntersection.getPosition()));
        Vector3D normalOfSurface = closestIntersection.getNormal();

        Vector3D halfVector = Vector3D.normalize(Vector3D.add(viewer, lightSource));

        //Vector3D directionBlinn = Vector3D.normalize(Vector3D.substract(lightSource, viewer));
        double prodBlinn = Math.max(Vector3D.dotProduct(normalOfSurface, halfVector), 0);

        double qBlinn = Math.pow(prodBlinn, shininess);

        double blinnPhongValue = closestIntersection.getObject().getCONST_SPECULAR() * qBlinn;

        float[] objColorsSpec = new float[]{objColor.getRed() * (float)blinnPhongValue / 255.0f,
                objColor.getGreen() * (float)blinnPhongValue / 255.0f,
                objColor.getBlue() * (float)blinnPhongValue / 255.0f};

        Color specular = new Color(clamp(objColorsSpec[0], 0, 1),
                clamp(objColorsSpec[1], 0, 1), clamp(objColorsSpec[2], 0, 1));
        return  specular;
    }
}
