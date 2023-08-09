Imports System.IO

Public Class Form1
    ' Display Sales Receipt Click Handler
    Private Sub BtnGenerateReceipt_Click(sender As Object, e As EventArgs) Handles BtnGenerateReceipt.Click
        ' Clear List Box
        LstReceipt.Items.Clear()

        ' Read Order.txt
        Dim orders As String() = File.ReadAllLines("Order.txt")

        ' Tracks Order Index
        Dim orderIndex As Integer = 0
        ' Tracks Total For Complete Order
        Dim total As Double = 0.0

        ' Read Cowboy.txt Line By Line
        For Each line As String In File.ReadLines("Cowboy.txt")
            ' Split Line From ',' Character
            Dim fields As String() = line.Split(",")
            ' Get Item Name From Fields
            Dim itemName As String = fields(0)
            ' Get Price From Fields And Parse It To Double
            Dim price As Double = Double.Parse(fields(1))
            ' Calulate Total For Current Item
            Dim currentTotal As Double = Integer.Parse(orders(orderIndex)) * price
            ' Add It To List Box
            LstReceipt.Items.Add(String.Format("{0,-5}{1,-20}$ {2,-5:0.00,}", orders(orderIndex), itemName, currentTotal))
            ' Add Current Total To Final Total
            total += currentTotal
            ' Increment Order Index
            orderIndex += 1
        Next
        ' Add Final Total To Receipt
        LstReceipt.Items.Add(String.Format("TOTAL: ${0:.00}", total))
    End Sub
End Class
