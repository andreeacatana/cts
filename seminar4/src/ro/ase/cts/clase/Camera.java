package ro.ase.cts.clase;

/*Catana Andreea-Maria => initiale CAM , camera*/

public class Camera {
	private int numar;
	private float suprafata;
	private String culoarePereti;
	
	private static Camera camera = null;
	
	private Camera(int numar, float suprafata, String culoarePereti) {
		this.numar = numar;
		this.suprafata = suprafata;
		this.culoarePereti = culoarePereti;
	}
	
	public static synchronized Camera getInstance(int numar, float suprafata, String culoarePereti) {
		if(camera == null) {
			camera = new Camera(numar, suprafata, culoarePereti);
		}
		return camera;
	}

	@Override
	public String toString() {
		return "Camera [numar=" + numar + ", suprafata=" + suprafata + ", culoarePereti=" + culoarePereti + "]";
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public void setSuprafata(float suprafata) {
		this.suprafata = suprafata;
	}

	public void setCuloarePereti(String culoarePereti) {
		this.culoarePereti = culoarePereti;
	}

}
