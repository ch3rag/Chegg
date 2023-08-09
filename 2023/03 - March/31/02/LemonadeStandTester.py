# LemonadeStandTester.py

from LemonadeStand import *
import unittest

# Unit Test
class TestLemonadeStand(unittest.TestCase):
	def setUp(self) -> None:
		self.stand = LemonadeStand('Lemons R Us')
		self.stand.add_menu_item(MenuItem('lemonade', .5, 1.5))
		self.stand.add_menu_item(MenuItem('cookie', .2, 1))
		self.stand.enter_sales_for_today({ 'lemonade' : 5, 'cookie' : 2})
		self.stand.enter_sales_for_today({ 'lemonade' : 1, 'cookie' : 3})

	def test_constructor(self) -> None:
		self.assertEqual(self.stand.get_name(), 'Lemons R Us')

	def test_invalid_menuitem_should_raise_error(self) -> None:
		self.assertRaises(InvalidSalesItemError, lambda: self.stand.enter_sales_for_today({'cola': 1}))

	def test_total_sales_for_menu_item(self) -> None:
		self.assertEqual(self.stand.total_sales_for_menu_item('lemonade'), 6)
		self.assertEqual(self.stand.total_sales_for_menu_item('cookie'), 5)

	def test_total_profit_for_menu_item(self):
		self.assertEqual(self.stand.total_profit_for_menu_item('lemonade'), 6)
		self.assertEqual(self.stand.total_profit_for_menu_item('cookie'), 4)

	def test_total_profit_for_stand(self):
		self.assertEqual(self.stand.total_profit_for_stand(), 10)

	def test_get_sales_dict_for_day(self):
		self.assertEqual(self.stand.get_sales_dict_for_day(1), {'lemonade' : 1, 'cookie' : 3})

if __name__ == '__main__':
	print('Unit Tests:')
	unittest.main()