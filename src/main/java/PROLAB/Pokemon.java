package PROLAB;

public class Pokemon implements IPokemon {
    private int pokemonID;
    private String pokemonAdi;
    private String pokemonTipi;
    
    public Pokemon(){
        super();
    }

    public Pokemon(int pokemonID,String pokemonAdi,String pokemonTipi){
       super();
        this.pokemonID=pokemonID;
        this.pokemonAdi=pokemonAdi;
        this.pokemonTipi=pokemonTipi;
    }
    
    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public String getPokemonTipi() {
        return pokemonTipi;
    }

    public void setPokemonTipi(String pokemonTipi) {
        this.pokemonTipi = pokemonTipi;
    }

	@Override
	public int hasarPuaniGoster() {
		// TODO Auto-generated method stub
		return 0;
	}
   
    
}
