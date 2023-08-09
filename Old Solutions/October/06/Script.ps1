# Input A Number
[int] $num = Read-Host 'Input A Number'

# Check If The Divisible By 3 XOR 4
if ($num % 3 -eq 0 -xor $num % 4 -eq 0) {
	Write-Host $num 'is divisible by 3 XOR 4.'
} else {
	Write-Host $num 'is NOT divisible by 3 XOR 4.'
}
