package PROLAB;

public class Pikachu extends Pokemon implements IPokemon {
	private boolean kartKullanildiMi=false;
    private int hasarPuani;

    	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}

	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}

   
    public Pikachu(){
        super();
		super.setPokemonID(1);
		super.setPokemonAdi("Pikachu");
		super.setPokemonTipi("Elektrik");
    }
    
    public Pikachu(int pokemonID,String pokemonAdi,String pokemonTipi,int hasarPuani){
        super(pokemonID,pokemonAdi,pokemonTipi);
        super.setPokemonID(1);
	super.setPokemonAdi("Pikachu");
	super.setPokemonTipi("Elektrik");
        
        this.hasarPuani=hasarPuani;
        
    }
    
     @Override
    public void setPokemonTipi(String pokemonTipi) {
        super.setPokemonTipi(pokemonTipi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPokemonTipi() {
        return super.getPokemonTipi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPokemonAdi(String pokemonAdi) {
        super.setPokemonAdi(pokemonAdi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPokemonAdi() {
        return super.getPokemonAdi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPokemonID(int pokemonID) {
        super.setPokemonID(pokemonID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPokemonID() {
        return super.getPokemonID(); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }   

    @Override
    public int hasarPuaniGoster() {
        return 40;

    }
}

