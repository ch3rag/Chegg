<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.BtnGenerateReceipt = New System.Windows.Forms.Button()
        Me.LstReceipt = New System.Windows.Forms.ListBox()
        Me.SuspendLayout()
        '
        'BtnGenerateReceipt
        '
        Me.BtnGenerateReceipt.Location = New System.Drawing.Point(12, 12)
        Me.BtnGenerateReceipt.Name = "BtnGenerateReceipt"
        Me.BtnGenerateReceipt.Size = New System.Drawing.Size(353, 45)
        Me.BtnGenerateReceipt.TabIndex = 0
        Me.BtnGenerateReceipt.Text = "Display Sales Receipt"
        Me.BtnGenerateReceipt.UseVisualStyleBackColor = True
        '
        'LstReceipt
        '
        Me.LstReceipt.Font = New System.Drawing.Font("Consolas", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.LstReceipt.FormattingEnabled = True
        Me.LstReceipt.ItemHeight = 14
        Me.LstReceipt.Location = New System.Drawing.Point(12, 63)
        Me.LstReceipt.Name = "LstReceipt"
        Me.LstReceipt.Size = New System.Drawing.Size(353, 102)
        Me.LstReceipt.TabIndex = 1
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(377, 176)
        Me.Controls.Add(Me.LstReceipt)
        Me.Controls.Add(Me.BtnGenerateReceipt)
        Me.Name = "Form1"
        Me.Text = "Cowboys"
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents BtnGenerateReceipt As Button
    Friend WithEvents LstReceipt As ListBox
End Class
