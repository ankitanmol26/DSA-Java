param (
    [string]$FilePath
)

if (-not $FilePath) {
    Write-Host "Usage: .\run_java.ps1 <path-to-JavaFile.java>"
    exit 1
}

$fileInfo = Get-Item $FilePath
$fileDir = $fileInfo.DirectoryName
$fileName = $fileInfo.Name
$className = $fileInfo.BaseName

# Check for package declaration
$packageLine = Get-Content $FilePath | Where-Object { $_ -match '^\s*package\s+([^;]+);' } | Select-Object -First 1
$packageName = ""
if ($packageLine -and $packageLine -match '^\s*package\s+([^;]+);') {
    $packageName = $matches[1].Trim()
}

if ($packageName) {
    $fullClassName = "$packageName.$className"
    Write-Host "[Java Runner] Package detected: $packageName"
    
    # Determine source root directory based on package structure
    $packageParts = $packageName.Split('.')
    $currentDir = $fileDir
    for ($i = 0; $i -lt $packageParts.Length; $i++) {
        $currentDir = Split-Path -Parent $currentDir
    }
    $sourceRoot = $currentDir

    Write-Host "[Java Runner] Compiling $fullClassName from root: $sourceRoot..."
    & javac -d "$sourceRoot" "$FilePath"
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

    Write-Host "[Java Runner] Running $fullClassName..."
    & java -cp "$sourceRoot" "$fullClassName"
} else {
    Write-Host "[Java Runner] Compiling $fileName..."
    Push-Location $fileDir
    try {
        & javac "$fileName"
        if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

        Write-Host "[Java Runner] Running $className..."
        & java -cp . "$className"
    } finally {
        Pop-Location
    }
}
