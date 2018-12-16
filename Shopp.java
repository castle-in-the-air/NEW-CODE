
public class Shopp{
	public static void main(String[] args){
	System.out.println("商品库存清单");
	System.out.println("商品名      尺寸      价格      库存");
	String macBrand="MacBookAir";
	double macSize=13.3;
	double macPrice=6988.88;
	int macCount=5;
	
	String thinkBrand="ThinkPadT450";
	double thinkSize=14;
	double thinkPrice=5999.99;
	int thinkCount=10;
	
	String asusBrand="ASUS-FL5800";
	double asusSize=15.6;
	double asusPrice=4999.5;
	int asusCount=18;
	System.out.println(macBrand+"    "+macSize+"    "+macPrice+"    "+macCount);
	System.out.println(thinkBrand+"  "+thinkSize+"  "+thinkPrice+"  "+thinkCount);
	System.out.println(asusBrand+"   "+asusSize+"   "+asusPrice+"   "+asusCount);
	
	int totalCount=macCount+thinkCount+asusCount;
	double totalMoney=macCount*macPrice+thinkCount*thinkPrice+asusCount*asusPrice;
	System.out.println("总库存数："+totalCount);
	System.out.println("总金额："+totalMoney);
	}
}