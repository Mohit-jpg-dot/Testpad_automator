<img src="https://login.testpad.chitkara.edu.in/images/chitkara_logo_primary.png"></br></br>

# Testpad Automator

Testpad Automator helps you open Testpad courses in a browser and:

- Complete a course using saved answers.
- Download answers from a course you already completed.

## Requirements

- Python 3.10 or newer
- Google Chrome or Firefox
- A Testpad account

## 1. Download the project

```sh
git clone <your-github-repository-url>
cd Testpad_automator
```

If you already downloaded the project as a ZIP file, extract it and open the `Testpad_automator` folder in Terminal or VS Code.

## 2. Install and activate Python

### macOS or Linux

```sh
python3 -m venv .venv
source .venv/bin/activate
python -m pip install -r requirements.txt
cp .env.example .env
```

### Windows

```powershell
py -m venv .venv
.venv\Scripts\Activate.ps1
python -m pip install -r requirements.txt
Copy-Item .env.example .env
```

## 3. Add your Testpad login

Open `.env` and replace the sample values:

```text
TESTPAD_EMAIL=your_testpad_email
TESTPAD_PASSWORD=your_testpad_password
```

Do not share or upload your `.env` file.

## 4. Start Jupyter

```sh
jupyter lab
```

Jupyter will open in your browser.

## 5. Run the project

### To complete a course

1. Open `complete_course.ipynb`.
2. In the settings cell, set:

```python
COURSE_NAME = "Exact course name shown on Testpad"
BROWSER = "CHROME"  # Use "FIREFOX" if you prefer Firefox
HEADLESS_MODE = False
SKIP_TUTORIALS = True
```

3. Run every code cell from top to bottom.
4. Keep the browser window open and in the foreground.

Saved solutions must be placed in `Testpad-Solutions/<Course Name>/`.

### To download answers

1. Open `download_answers.ipynb`.
2. Set `COURSE_NAME` to the exact course name shown on Testpad.
3. Run every code cell from top to bottom.

Downloaded answers will be saved inside the `Testpad-Solutions` folder.

## Common problems

### Selenium or python-dotenv is missing

Activate the virtual environment and install dependencies again:

```sh
python -m pip install -r requirements.txt
```

### Jupyter cannot find the virtual environment

From the project folder, run:

```sh
python -m pip install ipykernel
python -m ipykernel install --user --name testpad-automator
```

Then select **testpad-automator** as the notebook kernel.

### Session expired

Log in again through the browser and rerun the notebook from the start.
