import discord #MTExNDcyMjM3MDY2NjYyNzEzMg.GlYMZ1.QeWvurQtAwOfZbwg1qJgUR-tplrET8VKc4CbyU
from discord.ext import commands
intents = discord.Intents().all()
Gilbert27 = commands.Bot(command_prefix=".",intents=intents)

@Gilbert27.command()
async def say(ctx,**message):
    ctx.reply(message)

Gilbert27.run("MTExNDcyMjM3MDY2NjYyNzEzMg.Gws-BB.Koj3ukeLev1drv-P5l4vbBcBOvmbKE5o0FHFVY")