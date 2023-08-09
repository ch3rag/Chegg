# LemonadeStand.py

# Menu Stand Class
class MenuItem:
	# Constructor
	def __init__(self, name: str, wholesale_cost: float, selling_price: float) -> None:
		self._name = name
		self._wholesale_cost = wholesale_cost
		self._selling_price = selling_price
	
	# Returns Name of The Menu Item
	def get_name(self) -> str:
		return self._name
	
	# Returns Wholesale Cost Of The Menu Item
	def get_wholesale_cost(self) -> float:
		return self._wholesale_cost
	
	# Returns Selling Price Of The Menu Item
	def get_selling_price(self) -> float:
		return self._selling_price

# Sales For Day Class
class SalesForDay:
	# Constructor
	def __init__(self, day: int, sales_dict: dict[str, int]) -> None:
		self._day = day
		self._sales_dict = sales_dict
	
	# Returns Day Of Sale
	def get_day(self) -> int:
		return self._day

	# Return Sales Dict
	def get_sales_dict(self) -> dict[str, int]:
		return self._sales_dict

# Lemonade Stand Class
class LemonadeStand:
	# Constructor
	def __init__(self, name: str) -> str:
		self._name = name
		self._current_day = 0
		self._menu_items : dict[str, MenuItem] = {}
		self._sales : list[SalesForDay] = []

	# Returns Name Of The Stand
	def get_name(self) -> str:
		return self._name

	# Adds A Menu Item
	def add_menu_item(self, item: MenuItem) -> None:
		self._menu_items[item.get_name()] = item
	
	# Add Sales For Today
	def enter_sales_for_today(self, sales_data: dict[str, int]) -> None:
		for item in sales_data:
			if item not in self._menu_items:
				raise InvalidSalesItemError(f'{item} is not a valid MenuItem.')
		self._sales.append(SalesForDay(self._current_day, sales_data))
		self._current_day += 1
				
	# Return Sales Dictionary For A Particular Day
	def get_sales_dict_for_day(self, day:int) -> dict:
		return self._sales[day].get_sales_dict()
	
	# Returns Total Number Of Sales Of A Particular Item
	def total_sales_for_menu_item(self, item: str) -> int:
		if item not in self._menu_items:
			raise InvalidSalesItemError(f'{item} is not a valid MenuItem.')
		total_sales: int = 0
		for sale in self._sales:
			sales_dict = sale.get_sales_dict()
			if item in sales_dict:
				total_sales += sales_dict[item]
		return total_sales
	
	# Returns Total Profit Earned By The Sales Of A Particular Item
	def total_profit_for_menu_item(self, item: str) -> float:
		total_sales: int = self.total_sales_for_menu_item(item)
		item: MenuItem = self._menu_items[item]
		return total_sales * (item.get_selling_price() - item.get_wholesale_cost())
	
	# Returns Total Profit For The Stand Till Date
	def total_profit_for_stand(self) -> float:
		total_profit: float = 0
		for item in self._menu_items:
			total_profit += self.total_profit_for_menu_item(item)
		return total_profit

# Invalid Sales Item Error Class
class InvalidSalesItemError(Exception):
	pass

# Main
def main():
	# Create A Lemonade Stand
	myLemonadeStand = LemonadeStand('Jerry\'s Fresh Lemonade')
	# Create MenuItems
	lemonade = MenuItem('Lemonade', .5, 1.5)
	cookie = MenuItem('Cookie', .2, 1)
	# Add Them To Lemonade Stand
	myLemonadeStand.add_menu_item(lemonade)
	myLemonadeStand.add_menu_item(cookie)

	# Create Sales Dict
	sales = {
		'Lemonade': 2,
		'Cookie': 5,
		'Soda': 1
	}

	# Try To Enter Sales Data
	try:
		myLemonadeStand.enter_sales_for_today(sales)
	except InvalidSalesItemError as e:
		# If Error Occurs Print The Error Message
		print(e)
	
if __name__ == '__main__':
	main()