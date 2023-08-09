function Get-Random-String([int] $N) {
	return -Join ((65..90) + (97..122) + ('!', '.', ',', '?', '(', ')', '@', ';', ':') | Get-Random -Count $N | ForEach-Object {[Char]$_})
}

function Get-Min-Max-Avg([int[]] $Arr) {

	if ($Arr.Length -eq 0) {
		return @{
			Min = 0
			Max = 0
			Avg = 0
		}
	}

	[int]$Min = $Arr[0]
	[int]$Max = $Arr[0]
	[int]$Sum = $Arr[0]

	for ($i = 1; $i -lt $Arr.Length; $i++) {
		if ($Min -gt $Arr[$i]) {
			$Min = $Arr[$i]
		}

		if ($Max -lt $Arr[$i]) {
			$Max = $Arr[$i]
		}

		$Sum += $Arr[$i];
	}

	[double]$Avg = $Sum / $Arr.Length

	return @{
		Min = $Min
		Max = $Max
		Avg = $Avg
	}
}

Get-Random-String(10)
Get-Min-Max-Avg(@(1, 2, 3, 4, 5))

$Words = @('Hello', 'Word', 'Powershell', 'Microsoft', 'Programming',
	'Java', 'Python', 'Computers', 'Random', 'Functions', 'Lists', 'Array'
	'Methods', 'Script', 'Words', 'Coding', 'Google', 'Windows', 'Apple',
	'Hashtable', 'Logic', 'Console', 'Time', 'Numbers', 'Strings')

$CountOne = Get-Random (5..10)
$CountTwo = Get-Random (5..10)

$RandomWordsOne = Get-Random $Words -Count $CountOne
$RandomWordsTwo = Get-Random $Words -Count $CountTwo

Write-Host "Words One: " $RandomWordsOne
Write-Host "Words Two: " $RandomWordsTwo
function Array-XOR($ListOne, $ListTwo) {
	$NewArr = @()
	foreach ($Word in $ListOne) {
		if($ListTwo -notcontains $Word) {
			Write-Host "Yes"
			$NewArr += $Word
		}
	}

	foreach ($Word in $ListTwo) {
		if($ListOne -notcontains $Word) {
			$NewArr += $Word
		}
	}

	return $NewArr
}

Array-XOR($RandomWordsOne, $RandomWordsTwo)