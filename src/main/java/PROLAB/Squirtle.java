package PROLAB;

public class Squirtle extends Pokemon implements IPokemon{
    private int hasarPuani;
    private boolean kartKullanildiMi = false;
    
    public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}

	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
    
    public Squirtle(){
    	super();
		super.setPokemonID(4);
		super.setPokemonAdi("Squirtle");
		super.setPokemonTipi("Su");
    }
    
    public Squirtle(int pokemonID,String pokemonAdi,String pokemonTipi,int hasarPuani){
        super(pokemonID,pokemonAdi,pokemonTipi);
        super.setPokemonID(4);
		super.setPokemonAdi("Squirtle");
		super.setPokemonTipi("Su");
        this.hasarPuani=hasarPuani;
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

	public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }
    
    @Override
    public int hasarPuaniGoster() {
        return 30;

    }
}
