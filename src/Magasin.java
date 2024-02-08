/**
* Classe représentant un magasin
* @author basé sur Mélissa Jourdain
* Note: cette classe est à compléter. Les return qui sont déjà dans les fonctions y sont seulement pour permettre
* 		la compilation
*/
public class Magasin{
	private String pNom;
	private int pMaxCapacite;
	Produit [] produits;

	/** DÉCLAREZ LES VARIABLES MEMBRES ICI **/
	
	
	/**
	* Constructeur de la classe Magasin
	* @param pNom le nom du magasin
	* @param pMaxCapacite la capacité maximale du magasin
	*/
	public Magasin(String pNom, int pMaxCapacite){
		//A FAIRE
		this.pNom = pNom;
		this.pMaxCapacite = pMaxCapacite;
	}
	
	/**
	* Fonction qui retourne une représentation sous forme de String du magasin
	* Conseil: utilisez la fonction toString de la classe Produit
	* @return String la representation sous forme d'une chaîne de caractères du magasin
	*/
	public String toString(){
		//A FAIRE
		return "";
	}
	/**
	* Fonction permettant de trouver l'index d'un produit dans le tableau de produit du magasin. 
	* La recherche se fait selon le numéro d'identification du produit à trouver
	* Conseil: cette fonction est utilisée par beaucoup d'autres fonctions de cette classe, alors prenez la peine
	* 			de bien la debugger.
	* @param pId le numéro d'identification du produit à chercher
	* @return int l'index du produit avec le numéro d'identification id, -1 si le produit n'est pas dans le
	*			  magasin
	*/
	public int trouverProduit(int pId){
		//A FAIRE
		return -1;
	}
	/**
	* Fonction permettant de retrouver le nom d'un produit selon son numéro d'identification
	* Cette fonction est utilisée par l'option 'f' du menu propose dans GestionMagasin.java
	* Conseil: utilisez la fonction trouverProduit(int id).
	* @param id le numéro d'identification du produit à chercher
	* @return String le nom du produit à chercher. Cette fonction retourne la chaîne de caractères vide "" si
	* 		  le produit n'est pas présent dans le magasin.
	*/
	public String getNomProduit(int id){
		//A FAIRE
		return "";
	}
	
	/**
	* Fonction permettant d'ajouter un nouveau produit dans le magasin
	* Si un produit déjà dans le magasin a le même numéro d'identification que le nouveau produit à ajouter,
	* on n'ajoute pas de produit. Si le magasin est rempli, on n'ajoute pas le produit non plus
	* Conseil: Pensez à utiliser la fonction trouverProduit
	* @param pNom le nom du nouveau produit
	* @param pPrix le prix du nouveau produit
	* @param pId le numero d'identification du nouveau produit
	* @return boolean indique si l'ajout du nouveau produit a été fait ou non
	* 
	*/
	public boolean ajouterProduit(String pNom, float pPrix, int pId){
		//A FAIRE
		return true;
	}
	
	/**
	* Retire un produit ayant le numéro d'identification pId. Si ce numéro d'identification
	* n'est pas dans le magasin, on ne retire pas le produit.
	* Conseil: Utilisez la fonction trouverProduit
	* @param pId le numéro d'identification du produit à retirer du magasin
	* @return boolean indique si le produit a été retiré ou non.
	*/
	public boolean enleverProduit(int pId){
		//A FAIRE
		return true;
	}
	
}
