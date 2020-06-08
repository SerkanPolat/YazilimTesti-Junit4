package PROLAB;

public class Butterfree extends Pokemon implements IPokemon{
	private boolean kartKullanildiMi = false;
	private int hasarPuani;
    
    public Butterfree(){
    	super();
		super.setPokemonID(8);
		super.setPokemonAdi("Butterfree");
		super.setPokemonTipi("Hava");
    }
    
    public Butterfree(int pokemonID,String pokemonAdi,String pokemonTipi,int hasarPuani){
        super(pokemonID,pokemonAdi,pokemonTipi);
		super.setPokemonID(8);
		super.setPokemonAdi("Butterfree");
		super.setPokemonTipi("Hava");
        
        this.hasarPuani=hasarPuani;
    }
    
    public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}

	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    @Override
	public int getPokemonID() {
		// TODO Auto-generated method stub
		return super.getPokemonID();
	}

	@Override
	public void setPokemonID(int pokemonID) {
		// TODO Auto-generated method stub
		super.setPokemonID(pokemonID);
	}

	@Override
	public String getPokemonAdi() {
		// TODO Auto-generated method stub
		return super.getPokemonAdi();
	}

	@Override
	public void setPokemonAdi(String pokemonAdi) {
		// TODO Auto-generated method stub
		super.setPokemonAdi(pokemonAdi);
	}

	@Override
	public String getPokemonTipi() {
		// TODO Auto-generated method stub
		return super.getPokemonTipi();
	}

	@Override
	public void setPokemonTipi(String pokemonTipi) {
		// TODO Auto-generated method stub
		super.setPokemonTipi(pokemonTipi);
	}

	@Override
    public int hasarPuaniGoster() {
        return hasarPuani;

    }
    
    
}
