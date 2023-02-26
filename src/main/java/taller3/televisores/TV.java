package taller3.televisores;

public class TV {
	
	Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	
	public Marca getMarca() {
		return marca;
	}	
	public void setMarca(Marca make) {
		marca = make;
	}
	
	
	public Control getControl() {
		return control;
	}	
	public void setControl(Control contr) {
		control = contr;
	}
	
	
	public int getPrecio() {
	     return precio;
	}
	public void setPrecio(int precio) {
        this.precio = precio;
    }
	
	
	public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
	
	
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }


    public TV() {
        this.numTV = 0;
    }
    public int getNumTV() {
        return numTV;
    } 
    public void turnOn() {
    	this.estado = true;
    }
    public void turnOff() {
    	this.estado = false;
    }
    public boolean getEstado() {
    	return estado;
    }
    
    
    public void canalUp() {
    	if (estado && canal < 120) {
    		canal++;
    	}
    }
    public void canalDown() {
    	if (estado && canal > 1) {
    		canal--;
    	}
    }
    
    
    public void volumenUp() {
    	if (estado && volumen < 7) {
    		volumen++;
    	}
    }
    public void volumenDown() {
    	if (estado && volumen > 0) {
    		volumen--;
    	}
    }
}

