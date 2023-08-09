Option Explicit

Sub BMICalc()
    ' Variable Declaration
    Dim Name As String
    Dim Height As Double
    Dim Weight As Double
    Dim BMI As Double
    Dim Category As String
    Dim UserInput As String
    On Error GoTo ErrorHandler
    ' Input Name
    Name = InputBox("Please Enter Your Name", "Input Details")
    
HeightInput:
    ' Input Age
    UserInput = InputBox("Please Enter Your Height", "Input Details")
    If StrPtr(UserInput) = 0 Then
        ' User Pressed Cancel
        Err.Raise vbObjectError + 1000, , "Height is A Mandatory Input!"
    ElseIf UserInput = vbNullString Then
        ' User Entered An Empty String
        Err.Raise vbObjectError + 1000, , "Input Cannot Be Empty!"
    End If
    
    ' Cast Input To Double
    Height = CDbl(UserInput)
    
    ' Check If Input Is Positive
    If Height < 0 Then
        Err.Raise vbObjectError + 1000, , "Height Can't Be Negative!"
    End If
    
WeightInput:
    UserInput = InputBox("Please Enter Your Weight", "Input Details")
    If StrPtr(UserInput) = 0 Then
        ' User Pressed Cancel
        Err.Raise vbObjectError + 2000, , "Weight is A Mandatory Input!"
    ElseIf UserInput = vbNullString Then
        ' User Entered An Empty String
        Err.Raise vbObjectError + 2000, , "Input Cannot Be Empty!"
    End If
    ' Cast Input To Double
    Weight = CDbl(UserInput)
    
    ' Check If Input Is Positive
    If Weight < 0 Then
        Err.Raise vbObjectError + 2000, , "Weight Can't Be Negative!"
    End If
    
    ' BMI Calculation
    BMI = Weight / (Height ^ 2)
    
    ' Find Category
    If BMI < 16 Then
        Category = "Severly Underweight"
    ElseIf BMI < 18.5 Then
        Category = "Underweight"
    ElseIf BMI < 25 Then
        Category = "Normal"
    ElseIf BMI < 30 Then
        Category = "Overweight"
    ElseIf BMI < 30 Then
        Category = "Obese"
    Else
        Category = "Morbidly Obese"
    End If
    
    ' Display Result
    
    Exit Sub
ErrorHandler:
    Select Case Err.Number
        Case 13:
            ' Non Numeric Input
            MsgBox "Error: Please Enter Only A Valid Number!", vbCritical + vbOKOnly, "Error"
            Resume
        Case vbObjectError + 1000
            MsgBox "Error: " & Err.Description, vbCritical + vbOKOnly, "Error"
            Resume HeightInput
        Case vbObjectError + 2000
            MsgBox "Error: " & Err.Description, vbCritical + vbOKOnly, "Error"
            Resume WeightInput
    End Select
End Sub

Sub Main()
    BMICalc
End Sub
