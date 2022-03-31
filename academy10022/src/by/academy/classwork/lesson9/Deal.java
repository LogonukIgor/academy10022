package by.academy.classwork.lesson9;

import java.util.Arrays;

public class Deal {

	protected String timeDate;
	protected String place;
	protected User buyer;
	protected User seller;
	protected Product[] products;

	public Deal() {
		super();
	}

	public Deal(String timeDate, String place, User buyer, User seller, Product[] products) {
		super();
		this.timeDate = timeDate;
		this.place = place;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public void deal() {
		if (products == null) {
			System.out.println("В корзине ничего нет)");
			return;
		}
		double fullPrice = 0;
		for (Product p : products) {
			fullPrice += p.getCalculatePrice();
		}
		if (buyer.maney < fullPrice) {
			System.out.println("У Вас недостаточно денег");
			return;
		} else {
			seller.maney += fullPrice;
			buyer.maney -= fullPrice;
		}
		System.out.println("-------------- ОАО СКАМ --------------");
		System.out.println();
		System.out.println("Товары:");
		System.out.println();

		for (Product p : products) {
			System.out.println(p + "  " + p.getCalculatePrice() + "р");
		}
		System.out.println();
		System.out.println("                      Итого:  " + fullPrice + "р");
		System.out.println();
		System.out.println("-------------------------------------");
	}

	public String getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(String timeDate) {
		this.timeDate = timeDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [timeDate=");
		builder.append(timeDate);
		builder.append(", place=");
		builder.append(place);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", products=");
		builder.append(Arrays.toString(products));
		builder.append("]");
		return builder.toString();
	}

}
