public class Faction {
    FactionList factions;
    int satisfaction;
    int industry;
    int agriculture;
    int treasury;
    int reserves;
    int supporters;

    public Faction(int index) {
    this.factions = FactionList.values()[index];
    this.industry = 15;
    this.agriculture = 15;
    this.treasury = 200;
    this.supporters = 15;
    this.reserves = this.supporters * 40;
    if ( this.factions == FactionList.Loyalists){
        this.satisfaction = 100;
    }
    else
        {
        this.satisfaction = 50;
    }
    }


}
